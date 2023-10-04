package com.example.services;

import java.util.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.PedidosDao;
import com.example.dto.ProductoDTO;
import com.example.model.Pedido;

/**
 * Servicio que se encarga de la logica y la conexion con las BBDD del Proyecto
 */
@Service
public class PedidosServiceImpl implements PedidosService {

    @Autowired
    PedidosDao dao;

    @Autowired
    RestTemplate template;

    String url1 = "http://localhost:8880/productos";
    String url2 = "http://localhost:8880/producto";

    /**
     * Metodo que recibe un String nombre y un int unidades y se encarga de comparar el nombre
     * con un listado de productos recogidos con el RestTemplate del otro microservicio y si
     * coincide el nombre le resto el numero de unidades a su stock.
     * 
     * Posteriormente guardo el pedido con informacion del Producto localizado e invoco al metodo
     * que actualize el stock del producto
     */
    @Override
    public void postPedido(String nombre, int unidades) {
        List<ProductoDTO> productos = Arrays.asList(template.getForObject(url1, ProductoDTO[].class));
        ProductoDTO producto = new ProductoDTO();
        Pedido pedido;

        for (ProductoDTO productoDTO : productos) {
            if(productoDTO.getNombre().equalsIgnoreCase(nombre)){
                producto = productoDTO;
            }
        }
        
        pedido = new Pedido(producto.getCodigo(), unidades, unidades * producto.getPrecio(), new Date());
        dao.save(pedido);
        
        producto.setStock(producto.getStock()-unidades);
        System.out.println(producto);
        template.put(url2,  producto);
    }

    /**
     * Devuelve un listado de pedidos
     */
    @Override
    public List<Pedido> getPedidos() {
        return dao.findAll();
    }
    
}

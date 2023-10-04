package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Pedido;
import com.example.services.PedidosService;

/**
 * Controlador que se encarga de Mapear y dirigir todas las urls del Proyecto
 */
@RestController
public class PedidosController {

    @Autowired
    PedidosService service;

    /**
     * Metodo post que Recibe los Parametros nombre y unidades, y se encarga de 
     * añadir un pedido y actualizar el stock de un producto
     * @param nombre
     * @param unidades
     */
    @PostMapping(value="pedido/{nombreProducto}/{unidades}")
    public void postPedido(
        @PathVariable("nombreProducto") String nombre,
        @PathVariable("unidades") int unidades){

        service.postPedido(nombre, unidades);
    }

    /**
     * Devuelve un listado de pedidos
     */
    @GetMapping(value="pedidos")
    public List<Pedido> getPedidos(){
        return service.getPedidos();
    }


}

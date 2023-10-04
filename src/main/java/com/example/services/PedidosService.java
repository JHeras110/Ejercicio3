package com.example.services;

import java.util.List;

import com.example.model.Pedido;

/**
 * Interfaz que hace de intermediario entre el controlador y el servicio
 * @see com.example.services.PedidosServiceImpl
 * @see com.example.controller.PedidosController
 */
public interface PedidosService {
    void postPedido(String nombre, int unidades);
    List<Pedido> getPedidos();
}

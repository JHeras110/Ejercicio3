package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Pedido;

/**
 * Interfaz que nos ayuda a mapear el objeto con el que vamos a trabajar a
 * la hora de intercambiar informacion con la BBDD
 */
public interface PedidosDao extends JpaRepository<Pedido, Integer>{

}

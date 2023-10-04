package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Pedido;

public interface PedidosDao extends JpaRepository<Pedido, Integer>{

}

package com.example.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idpedidos;
    private int codigoproducto;
    private int unidades;
    private double total;
    
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Pedido() {
    }
    public Pedido( int codigoProducto, int unidades, double total, Date fecha) {
        this.codigoproducto = codigoProducto;
        this.unidades = unidades;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId() {
        return idpedidos;
    }
    public void setId(int id) {
        this.idpedidos = id;
    }
    public int getCodigoProducto() {
        return codigoproducto;
    }
    public void setCodigoProducto(int codigoProducto) {
        this.codigoproducto = codigoProducto;
    }
    public int getUnidades() {
        return unidades;
    }
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

    
    
}

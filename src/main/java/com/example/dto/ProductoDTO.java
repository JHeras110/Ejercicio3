package com.example.dto;


/**
 * Modelo de Producto
 * 
 * @param codigo
 * @param nombre (Producto en la BBDD)
 * @param stock
 * @param precio
 */
public class ProductoDTO {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public ProductoDTO() {
    }
    public ProductoDTO(int codigo, String producto, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = producto;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}

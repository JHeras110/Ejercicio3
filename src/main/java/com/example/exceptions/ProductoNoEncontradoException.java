package com.example.exceptions;

public class ProductoNoEncontradoException extends RuntimeException{
    public ProductoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}


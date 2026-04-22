package com.problems.listas.ejercicio17;

public class Libro {

    private String codigo;
    private String titulo;
    private double precio;
    private int stock;

    public Libro(String codigo, String titulo, double precio, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void agregarEjemplares(int cantidad) {
        stock += cantidad;
    }

    public int prestar(int cantidad) {
        int prestados = Math.min(stock, cantidad); // aca la idea es ir prestando hasta donde haya.
        stock -= prestados;
        return prestados;
    }

    public void devolver(int cantidad) {
        stock += cantidad;
    }
}

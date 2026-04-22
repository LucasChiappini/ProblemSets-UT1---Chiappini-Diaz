package com.problems.listas.ejercicio17;

import java.util.ArrayList;
import java.util.Comparator;

public class Biblioteca {

    private Lista<Libro> catalogo;

    public Biblioteca() {
        catalogo = new Lista<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.insertar(libro);
    }

    public Libro buscar(String codigo) {
        return catalogo.buscar(l -> l.getCodigo().equals(codigo));
    }

    public void agregarEjemplares(String codigo, int cantidad) {
        Libro l = buscar(codigo);
        if (l != null) {
            l.agregarEjemplares(cantidad);
        }
    }

    public int prestar(String codigo, int cantidad) {
        Libro l = buscar(codigo);
        if (l != null) {
            return l.prestar(cantidad);
        }
        return 0;
    }

    public void devolver(String codigo, int cantidad) {
        Libro l = buscar(codigo);
        if (l != null) {
            l.devolver(cantidad);
        }
    }

    public void eliminar(String codigo) {
        catalogo.eliminar(l -> l.getCodigo().equals(codigo));
    }

    public int consultarStock(String codigo) {
        Libro l = buscar(codigo);
        return (l != null) ? l.getStock() : 0;
    }

    public void listar() {

        ArrayList<Libro> aux = new ArrayList<>();

        catalogo.recorrer(l -> aux.add(l));

        //Ordenamos por título
        aux.sort(Comparator.comparing(Libro::getTitulo));

        for (Libro l : aux) {
            System.out.println(l.getTitulo()
                    + " | Código: " + l.getCodigo()
                    + " | Stock: " + l.getStock());
        }
    }
}

package com.problems.conjuntos.ejercicio24;

import java.util.ArrayList;
import java.util.List;

public class Conjunto<T extends Comparable<T>> {
    private List<T> elementos = new ArrayList<>();

    public void insertar(T elemento) { // Solo se inserta si no está presente
        if (!elementos.contains(elemento)) {
            elementos.add(elemento);
            elementos.sort(Comparable::compareTo);
        }
    }

    public Conjunto<T> union(Conjunto<T> otro) { // Combina ambos conjuntos sin duplicados
        Conjunto<T> resultado = new Conjunto<>();
        resultado.elementos.addAll(this.elementos);
        for (T e : otro.elementos) {
            if (!resultado.elementos.contains(e)) resultado.elementos.add(e);
        }
        resultado.elementos.sort(Comparable::compareTo);
        return resultado;
    }

    public Conjunto<T> interseccion(Conjunto<T> otro) { // Solo los elementos comunes a ambos conjuntos
        Conjunto<T> resultado = new Conjunto<>();
        for (T e : this.elementos) {
            if (otro.elementos.contains(e)) resultado.insertar(e);
        }
        return resultado;
    }

    public List<T> getElementos() { return elementos; }
}
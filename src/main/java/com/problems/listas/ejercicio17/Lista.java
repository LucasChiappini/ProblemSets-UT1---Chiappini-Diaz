package com.problems.listas.ejercicio17;

import java.util.function.Predicate;

public class Lista<T> {

    private Nodo<T> primero;

    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo<T> actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public T buscar(Predicate<T> condicion) {
        Nodo<T> actual = primero;

        while (actual != null) {
            if (condicion.test(actual.dato)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }

        return null;
    }

    public boolean eliminar(Predicate<T> condicion) {
        Nodo<T> actual = primero;
        Nodo<T> anterior = null;

        while (actual != null) {
            if (condicion.test(actual.dato)) {

                if (anterior == null) {
                    primero = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }
                return true;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        return false;
    }

    public void recorrer(java.util.function.Consumer<T> accion) {
        Nodo<T> actual = primero;

        while (actual != null) {
            accion.accept(actual.dato);
            actual = actual.siguiente;
        }
    }

    //Ejercicio 18
    // Quita un elemento de la lista y lo devuelve (si existe)
    public T quitar(java.util.function.Predicate<T> condicion) {

        Nodo<T> actual = primero;
        Nodo<T> anterior = null;

        // Recorremos la lista
        while (actual != null) {

            // Si encontramos el elemento
            if (condicion.test(actual.dato)) {

                // Es el primero
                if (anterior == null) {
                    primero = actual.siguiente;
                } // Esta en el medio o final
                else {
                    anterior.siguiente = actual.siguiente;
                }

                // Devolvemos el elemento para reutilizarlo
                return actual.dato;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        // Si no se encontró
        return null;
    }

}

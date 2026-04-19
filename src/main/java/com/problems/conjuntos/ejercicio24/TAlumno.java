package com.problems.conjuntos.ejercicio24;

public class TAlumno implements Comparable<TAlumno> {
    private String cedula;
    private String nombre;
    private String apellido;

    public TAlumno(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public int compareTo(TAlumno otro) { // Ordenar por cédula
        return this.cedula.compareTo(otro.cedula);
    }

    @Override
    public boolean equals(Object obj) { // Dos alumnos son iguales si tienen la misma cédula
        if (this == obj) return true;
        if (!(obj instanceof TAlumno)) return false;
        return this.cedula.equals(((TAlumno)obj).cedula);
    }

    @Override
    public int hashCode() { return cedula.hashCode(); } // Para usar en estructuras de datos basadas en hash

    @Override
    public String toString() { return cedula + " - " + nombre + " " + apellido; } // Para imprimir el alumno de forma legible
}
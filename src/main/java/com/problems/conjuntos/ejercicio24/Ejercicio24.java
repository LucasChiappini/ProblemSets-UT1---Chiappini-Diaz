package com.problems.conjuntos.ejercicio24;

public class Ejercicio24 {

    public static void ejecutar() {
        System.out.println("--- Iniciando Ejercicio 24 ---");

            Conjunto<TAlumno> cursoAED1 = new Conjunto<>();
            Conjunto<TAlumno> cursoPF = new Conjunto<>();

            TAlumno nico = new TAlumno("0001", "Nicolas", "Diaz");
            TAlumno lucas = new TAlumno("0002", "Lucas", "Chiappini");
            TAlumno paco = new TAlumno("0003", "Paconi", "Lopez");
            TAlumno carlos = new TAlumno("0004", "Carlos", "Martinez");

            cursoAED1.insertar(nico);
            cursoAED1.insertar(lucas);
            cursoAED1.insertar(paco);

            cursoPF.insertar(lucas);
            cursoPF.insertar(paco);
            cursoPF.insertar(carlos);

            Conjunto<TAlumno> union = cursoAED1.union(cursoPF);
            System.out.println("Unión: " + union.getElementos());

            Conjunto<TAlumno> interseccion = cursoAED1.interseccion(cursoPF);
            System.out.println("Intersección: " + interseccion.getElementos());

        System.out.println("Ejercicio 24 finalizado con éxito.");
    }
}

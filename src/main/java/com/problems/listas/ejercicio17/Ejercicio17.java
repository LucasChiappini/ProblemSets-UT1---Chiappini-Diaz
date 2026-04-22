package com.problems.listas.ejercicio17;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio17 {

    public static void ejecutar() {
        System.out.println("--- Iniciando Ejercicio 17 ---");
        try {
            Biblioteca b = new Biblioteca();

            // ADQUISICIONES (Sub A)
            double total = 0;

            InputStream is = Ejercicio17.class.getResourceAsStream("/adquisiciones.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] p = linea.split(",");

                String codigo = p[0];
                String titulo = p[1];
                double precio = Double.parseDouble(p[2]);
                int cantidad = Integer.parseInt(p[3]);

                Libro libro = b.buscar(codigo);

                if (libro == null) {
                    libro = new Libro(codigo, titulo, precio, cantidad);
                    b.agregarLibro(libro);
                } else {
                    libro.agregarEjemplares(cantidad);
                }

                total += precio * cantidad;
            }

            br.close();

            System.out.println("Total agregado: " + total);

            // PRESTAMOS (Sub B)
            int variacion = 0;

            is = Ejercicio17.class.getResourceAsStream("/prestamos.txt");
            br = new BufferedReader(new InputStreamReader(is));

            while ((linea = br.readLine()) != null) {

                String[] p = linea.split(",");

                String codigo = p[0];
                String tipo = p[1];
                int cantidad = Integer.parseInt(p[2]);

                Libro libro = b.buscar(codigo);

                if (libro != null) {

                    if (tipo.equals("PRESTAMO")) {
                        int prestados = libro.prestar(cantidad);
                        variacion -= prestados;
                    } else {
                        libro.devolver(cantidad);
                        variacion += cantidad;
                    }
                }
            }

            br.close();

            System.out.println("Variación stock: " + variacion);

            // LISTADO FINAL
            System.out.println("\nListado:");
            b.listar();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Ejercicio 17 finalizado con éxito.");
    }
}

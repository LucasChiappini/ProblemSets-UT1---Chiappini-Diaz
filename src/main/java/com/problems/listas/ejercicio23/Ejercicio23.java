package com.problems.listas.ejercicio23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.problems.listas.ejercicio17.Lista;

public class Ejercicio23 {

    public static void ejecutar() {

        System.out.println("--- Iniciando Ejercicio 23 ---");

        //Para el punto 1
        Lista<String> suc1 = cargarArchivo("src/main/resources/suc1.txt");

        System.out.println("\nPunto 1:");
        System.out.println("Cantidad de sucursales: " + suc1.cantidad());

        System.out.println("Listado:");
        suc1.recorrer(c -> System.out.println(c));

        //Para el punto 2
        System.out.println("\nPunto 2:");

        suc1.eliminar(c -> c.equals("Chicago"));

        System.out.println("Después de eliminar Chicago:");
        suc1.recorrer(c -> System.out.println(c));

        String siguiente = suc1.siguienteDe("Hong Kong");
        System.out.println("Siguiente de Hong Kong: " + siguiente);

        //Para el punto 3
        Lista<String> suc2 = cargarArchivo("src/main/resources/suc2.txt");

        System.out.println("\nPunto 3:");

        suc2.eliminar(c -> c.trim().equals("Shenzen")); //tuve que usar trim debido a que me tomaba los espacios invisibiles.
        suc2.eliminar(c -> c.trim().equals("Tokio"));

        System.out.println("Cantidad luego de eliminar: " + suc2.cantidad());
        suc2.recorrer(c -> System.out.println(c));

        // Para el punto 4
        Lista<String> suc3 = cargarArchivo("src/main/resources/suc3.txt");

        System.out.println("\nPunto 4:");
        System.out.print("Resultado imprimir(\";\"): ");
        suc3.imprimir(";");

        System.out.println("\n\n--- Ejercicio 23 finalizado ---");
    }

    public static Lista<String> cargarArchivo(String ruta) {

        Lista<String> lista = new Lista<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linea;

            while ((linea = br.readLine()) != null) {

                // Buscando se tuvo que usar ese uFEFF para limpiar carácteres invisibles.
                linea = linea.replace("\uFEFF", "").trim();

                lista.insertar(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + ruta);
        }

        return lista;
    }
}

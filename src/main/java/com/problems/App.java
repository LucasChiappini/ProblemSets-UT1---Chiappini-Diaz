package com.problems;

import java.util.Scanner;

import com.problems.colas.ejercicio27.Ejercicio27;
import com.problems.conjuntos.ejercicio24.Ejercicio24;
import com.problems.listas.ejercicio17.Ejercicio17;
import com.problems.listas.ejercicio18.Ejercicio18;
import com.problems.listas.ejercicio23.Ejercicio23;
import com.problems.pilas.ejercicio19.Ejercicio19;
import com.problems.pilas.ejercicio26.Ejercicio26;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Ejercicios entregables ===");
            System.out.println("1 - Ejercicio 17 (Listas)");
            System.out.println("2 - Ejercicio 18 (Listas)");
            System.out.println("3 - Ejercicio 23 (Listas)");
            System.out.println("4 - Ejercicio 19 (Pilas)");
            System.out.println("5 - Ejercicio 26 (Pilas)");
            System.out.println("6 - Ejercicio 27 (Colas)");
            System.out.println("7 - Ejercicio 24 (Conjuntos)");
            System.out.println("0 - Salir");

            System.out.print("Selecciona una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("----- Listas ------ ");
                        Ejercicio17.ejecutar();
                    }
                    case 2 -> Ejercicio18.ejecutar();
                    case 3 -> Ejercicio23.ejecutar();
                    case 4 -> {
                        System.out.println("----- Pilas ------ ");
                        Ejercicio19.ejecutar();
                    }
                    case 5 -> Ejercicio26.ejecutar();
                    case 6 -> {
                        System.out.println("----- Colas ------ ");
                        Ejercicio27.ejecutar();
                    }
                    case 7 -> {
                        System.out.println("----- Conjuntos ------ ");
                        Ejercicio24.ejecutar();
                    }
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opcion invalida");
                }

            } else {
                System.out.println("Debes ingresar un número");
                sc.next();
                opcion = -1;
            }

        } while (opcion != 0);

        sc.close();
    }
}

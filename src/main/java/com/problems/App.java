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
            for (int i = 1; i <= 7; i++) {
                System.out.println(i + " - Ejercicio " + i);
            }
            System.out.println("0 - Salir");

            System.out.print("Selecciona una opcion: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("----- Listas ------ ");
                        Ejercicio17.ejecutar();
                        break;
                    case 2:
                        Ejercicio18.ejecutar();
                        break;
                    case 3:
                        Ejercicio23.ejecutar();
                        break;
                    case 4:
                        System.out.print("----- Pilas ------ ");
                        Ejercicio19.ejecutar();
                        break;
                    case 5:
                        Ejercicio26.ejecutar();
                        break;
                    case 6:
                        System.out.print("----- Colas ------ ");
                        Ejercicio27.ejecutar();
                        break;
                    case 7:
                        System.out.print("----- Conjuntos ------ ");
                        Ejercicio24.ejecutar();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion invalida");
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

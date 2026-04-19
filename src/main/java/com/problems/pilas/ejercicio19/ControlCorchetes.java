package com.problems.pilas.ejercicio19;
 
import java.util.List;
import java.util.Stack;

public class ControlCorchetes {

    public static void ejecutar19(String[] args) {
        List<Character> listaDeEntrada = List.of('{', '{', '}', '}');
        List<Character> listaDeEntrada2 = List.of('{', '}', '}', '{');
        boolean resultado = controlCorchetes(listaDeEntrada);
        System.out.println("¿Los corchetes estan correctamente? " + resultado);
        boolean resultado2 = controlCorchetes(listaDeEntrada2);
        System.out.println("¿Los corchetes de la segunda lista estan correctamente? " + resultado2);
    }

    public static boolean controlCorchetes(List<Character> listaDeEntrada) {
        Stack<Character> pila = new Stack<>(); // Stack para almacenar los corchetes de apertura
            for (Character caracter : listaDeEntrada) {
                if (caracter == '{') {
                    pila.push(caracter);
                } else if (caracter == '}') {
                    if (pila.isEmpty()) {
                        return false; // No hay un corchete de apertura para este cierre
                    }
                    char ultimoCorchete = pila.pop();
                    if (ultimoCorchete != '{') {
                        return false; // El corchete de cierre no corresponde al de apertura
                    }
                }
            }
        return pila.isEmpty();
    }

}
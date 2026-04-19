package com.problems.pilas.ejercicio19;
 
import java.util.List;
import java.util.Stack;

public class ControlCorchetes {

    public static void ejecutar19(String[] args) {
        List<Character> listaDeEntrada = List.of('{', '{', '}', '}');
        boolean resultado = controlCorchetes(listaDeEntrada);
        System.out.println("¿Los corchetes están correctamente balanceados? " + resultado);
    }

    public static boolean controlCorchetes(List<Character> listaDeEntrada) {
        Stack<Character> pila = new Stack<>(); // Stack para almacenar los corchetes de apertura
            
        return pila.isEmpty();
    }

}
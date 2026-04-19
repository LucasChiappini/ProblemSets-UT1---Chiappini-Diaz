package com.problems.pilas.ejercicio26;

import java.util.List;
import java.util.Stack;

public class Expresion {

    public void ejecutar26() {
            
        List<Character> listaDeEntrada = List.of('{', '(', ')', '}', '[', ']');
        boolean resultado = controlExpresion(listaDeEntrada);
        System.out.println("La expresion es " + (resultado));
        
        List<Character> listaDeEntrada2 = List.of('{', '(', ']', ')', '}', '[', ']');
        boolean resultado2 = controlExpresion(listaDeEntrada2);
        System.out.println("La segunda expresion es " + (resultado2));

    }

    public static boolean controlExpresion(List<Character> listaDeEntrada) {
        Stack<Character> pila = new Stack<>(); // Stack para almacenar los caracteres de apertura
        for (char caracter : listaDeEntrada) {
            if (caracter == '{' || caracter == '(' || caracter == '[') {
                pila.push(caracter);
            } else if (caracter == '}' || caracter == ')' || caracter == ']') {
                if (pila.isEmpty() || !esPareja(pila.pop(), caracter)) { // Verificar si la pila esta vacia
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    private static boolean esPareja(char apertura, char cierre) {
        return (apertura == '{' && cierre == '}') ||
               (apertura == '(' && cierre == ')') ||
               (apertura == '[' && cierre == ']');
    }
}

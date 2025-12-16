package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numero1 = 1;
        int numero2 = 2;

        calculadora.alteraDoisNumeros(numero1, numero2);

        System.out.println("Dentro da CalculadoraTest04");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);
    }
}

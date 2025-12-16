package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.model.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividirDoisNumeros(50, 5);
        System.out.println(resultado);
    }
}
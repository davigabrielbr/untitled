package javacore.Bintroducaometodos.model;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicarDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double dividirDoisNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            return 0;
        } else {
            return numero1 / numero2;
        }
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;

        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
    }
}
package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Davi");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1200, 1400, 1600});

        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
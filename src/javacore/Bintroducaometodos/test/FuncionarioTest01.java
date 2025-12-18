package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.model.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Davi";
        funcionario.idade = 21;
        funcionario.salarios = new double[]{1200, 1400, 1600};

        funcionario.imprime();
        funcionario.mediaSalarios();
    }
}
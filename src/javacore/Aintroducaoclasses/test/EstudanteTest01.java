package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.model.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Davi";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome + " Idade: " + estudante.idade + " Sexo: " + estudante.sexo);
    }
}
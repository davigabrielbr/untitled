package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.model.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Rafael";
        estudante1.idade = 35;
        estudante1.sexo = 'M';

        estudante2.nome = "Rafaela";
        estudante2.idade = 25;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
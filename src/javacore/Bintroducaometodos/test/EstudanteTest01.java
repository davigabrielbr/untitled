package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.model.Estudante;
import javacore.Bintroducaometodos.model.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Davi";
        estudante1.idade = 21;
        estudante1.sexo = 'M';

        estudante2.nome = "Adrielly";
        estudante2.idade = 24;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
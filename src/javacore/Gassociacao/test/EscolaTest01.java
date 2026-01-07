package javacore.Gassociacao.test;

import javacore.Gassociacao.model.Escola;
import javacore.Gassociacao.model.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Davi");
        Professor professor2 = new Professor("Gabriel");

        Professor [] professores = {professor1, professor2};
        Escola escola = new Escola("Escola Candeias", professores);

        escola.imprime();
    }
}
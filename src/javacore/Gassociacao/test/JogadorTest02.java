package javacore.Gassociacao.test;

import javacore.Gassociacao.model.Jogador;
import javacore.Gassociacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Davi");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
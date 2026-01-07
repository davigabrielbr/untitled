package javacore.Gassociacao.test;

import javacore.Gassociacao.model.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Davi");
        Jogador jogador2 = new Jogador("Lucas");
        Jogador jogador3 = new Jogador("Gabriel");

        Jogador [] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }
    }
}
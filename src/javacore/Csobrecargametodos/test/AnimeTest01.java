package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime2 = new Anime();

        anime.iniciar("Naruto", "TV", 12, "Ação");
        anime.imprime();
    }
}
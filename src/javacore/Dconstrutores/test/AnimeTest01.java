package javacore.Dconstrutores.test;

import javacore.Dconstrutores.model.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 12, "Ação", "Production IG");
        Anime anime2 = new Anime("Teste", "TV", 15, "Terror", "Estudio");
        
        anime.imprime();
    }
}
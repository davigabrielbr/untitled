package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.model.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Volkswagem";
        carro1.modelo = "Fusca";
        carro1.ano = 1938;

        carro2.nome = "Ford";
        carro2.modelo = "Mustang";
        carro2.ano = 1964;

        // carro1 = carro2; Referência de Objetos

        System.out.println("\nCarro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}

package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.model.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // pessoa.nome = "Davi";
        // pessoa.idade = 21;

        pessoa.setNome("Davi");
        pessoa.setIdade(21);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        // pessoa.imprime();
    }
}

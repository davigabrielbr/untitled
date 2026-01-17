package javacore.Hheranca.test;

import javacore.Hheranca.model.Endereco;
import javacore.Hheranca.model.Funcionario;
import javacore.Hheranca.model.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("Davi Gabriel");
        Funcionario funcionario = new Funcionario("Lucas Matheus");

        endereco.setRua("Rua amambai");
        endereco.setCep("012345-678");

        pessoa.setCpf("1234567890");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        funcionario.setCpf("12345");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("-------------------");

        funcionario.imprime();
    }
}
package javacore.Kenum.test;

import javacore.Kenum.model.Cliente;
import javacore.Kenum.model.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Davi", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Davi", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Davi", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Davi", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente5 = new Cliente("Davi", TipoCliente.PESSOA_JURIDICA2);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
    }
}
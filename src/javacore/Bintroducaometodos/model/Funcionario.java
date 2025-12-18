package javacore.Bintroducaometodos.model;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salarios;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double salario: salarios) {
            System.out.print(salario + " ");
        }
    }

    public void mediaSalarios() {
        double media = 0;

        for (double salario: salarios) {
            media += salario;
        }

        media /= salarios.length;

        System.out.println("\nMédia salarial: " + media);
    }
}

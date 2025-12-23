package javacore.Bintroducaometodos.model;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salarios;
    private double media;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double salario: salarios) {
            System.out.print(salario + " ");
        }

        mediaSalarios();
    }

    public void mediaSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario: salarios) {
            media += salario;
        }

        media /= salarios.length;

        System.out.println("\nMédia salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSalarios(double [] salarios) {
        this.salarios = salarios;
    }

    public double [] getSalarios() {
        return this.salarios;
    }

    public double getMedia() {
        return this.media;
    }
}
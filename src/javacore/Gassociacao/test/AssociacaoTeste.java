package javacore.Gassociacao.test;

import javacore.Gassociacao.model.Aluno;
import javacore.Gassociacao.model.Local;
import javacore.Gassociacao.model.ProfessorExercicio;
import javacore.Gassociacao.model.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("UNIFG - Faculdade dos Guararapes");
        Aluno aluno = new Aluno("Davi", 21);
        ProfessorExercicio professor = new ProfessorExercicio("Sidney", "Tecnologia");
        Aluno [] alunosSeminario = {aluno};

        Seminario seminario = new Seminario("Seminário de Java", alunosSeminario, local);
        Seminario [] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}

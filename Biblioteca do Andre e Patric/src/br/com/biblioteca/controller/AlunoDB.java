package br.com.biblioteca.controller;

import br.com.biblioteca.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDB implements LogAplicacao{

    private List<Aluno> alunos;

    public AlunoDB() {
        this.alunos = new ArrayList<>();
    }

    public List<Aluno> retornarTodos() {
        return alunos;
    }

    public void inserirAluno(Aluno aluno) {
        this.alunos.add(aluno);
        gravarLog("Aluno inserido - " + aluno.getNome());
    }

    @Override
    public void gravarLog(String log) {
        System.out.println(log);
    }
}

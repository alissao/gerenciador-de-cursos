package com.cotefacil2;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int getTempoTotal() {
//        int tempoTotal = 0;
//        for (Aula aula: this.aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal; //esse bloco comentado pode ser substituído pela linha de baixo
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

}

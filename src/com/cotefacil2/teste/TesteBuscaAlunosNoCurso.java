package com.cotefacil2.teste;

import com.cotefacil2.modelos.Aluno;
import com.cotefacil2.modelos.Aula;
import com.cotefacil2.modelos.Curso;

public class TesteBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso(
                "Dominando as coleções do Java",
                "Paulo Silveira"
        );
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
//        System.out.println(javaColecoes.getAulas());

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Alisson H", 656565);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 5617?");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("Aluno: " + aluno);


    }

}

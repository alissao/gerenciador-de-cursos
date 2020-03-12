package com.cotefacil2.teste;

import com.cotefacil2.modelos.Aluno;
import com.cotefacil2.modelos.Aula;
import com.cotefacil2.modelos.Curso;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno" + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

//        Set<Aluno> alunos = javaColecoes.getAlunos();

//        alunos.add(a4);
//        System.out.println(alunos.size());

        System.out.println("Todos os alunos matriculados:");
        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }

        //Vector existe mais em códigos legados e é thread-safe.
        //Mesmo assim, não é recomendado se utilizar Vectors hj em dia.
//        Vector<Aluno> vetor = new Vector<>();



    }

}

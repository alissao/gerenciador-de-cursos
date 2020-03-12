package com.cotefacil2.teste;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");

        System.out.println(alunos);

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        boolean pauloMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(alunos.size());

        alunos.remove("Sergio Lopes");

        System.out.println(pauloMatriculado);



    }

}

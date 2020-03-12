package com.cotefacil2.teste;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

//        //tente imprimir os alunos usando foreach
//        alunos.forEach(aluno -> {
//            System.out.println(aluno);
//        });
//        //TODO Duvida: O que seria a primeira palavra antes da seta em uma lambda? Uma classe ou instância?

        System.out.println("Alunos antes de adicionar um aluno que já existe ao conjunto: " + alunos.size());
        alunos.add("Paulo");
        System.out.println("Alunos após adicionar um aluno que já existe ao conjunto: " + alunos.size());

    }

}

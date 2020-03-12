package com.cotefacil2.teste;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        //porque isso abaixo funciona?
        pessoas.forEach((integer, s) -> System.out.println(s));


    }

}

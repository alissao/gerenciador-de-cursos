package com.cotefacil2.teste;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        nomesParaIdade.keySet().forEach(s -> System.out.println(s));
        nomesParaIdade.values().forEach(s -> System.out.println(s));


    }

}

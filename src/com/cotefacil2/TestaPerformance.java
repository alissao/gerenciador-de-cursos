package com.cotefacil2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {
        Collection<Integer> numeros = new HashSet<>();
//        Collection<Integer> numeros = new ArrayList<>();
//      Performance de pesquisa gritante a partir de 100k registros para o ArrayList.

        long insercao = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }

        insercao += -System.currentTimeMillis();

        long pesquisa = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        pesquisa += -System.currentTimeMillis();

        System.out.println("Tempo inserção: " + (insercao * -1));
        System.out.println("Tempo pesquisa: " + (pesquisa * -1));

    }

}

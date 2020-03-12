package com.cotefacil2.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas2 {

    public static void main(String[] args) {

        String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
        String curso2 = "Apache Camel";
        String curso3 = "Certificacao Java SE 8 Programmer I";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println("-----------Cursos antes da remoção--------");
        System.out.println(cursos);

        // qual metodo chamar aqui?
        cursos.remove(1);

        System.out.println("-----------Cursos depois da remoção--------");

        System.out.println(cursos);

        System.out.println("O primeiro curso da lista é o: " + cursos.get(0));

        System.out.println("-----------Cursos depois da ordenação alfabética--------");
        Collections.sort(cursos);
        System.out.println(cursos);
    }

}

package com.cotefacil2.teste;

import com.cotefacil2.modelos.Recibo;

import java.util.TreeSet;

public class TesteRecibo {

    public static void main(String[] args) {

        Recibo rec1 = new Recibo();

        Recibo rec2 = new Recibo();

        Recibo rec3 = new Recibo();

        TreeSet<Recibo> reciboTreeSet = new TreeSet<>();

        reciboTreeSet.add(rec1);
        reciboTreeSet.add(rec2);
        reciboTreeSet.add(rec3);

    }

}

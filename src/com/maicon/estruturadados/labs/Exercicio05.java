package com.maicon.estruturadados.labs;

import com.maicon.estruturadados.Lista;

import java.util.ArrayList;

public class Exercicio05 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();
        System.out.println(arrayList);

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);
        lista.limpar();
        System.out.println(lista);
    }
}

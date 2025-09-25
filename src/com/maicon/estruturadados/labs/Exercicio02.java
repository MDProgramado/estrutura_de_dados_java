package com.maicon.estruturadados.labs;

import com.maicon.estruturadados.Lista;

import java.util.ArrayList;

public class Exercicio02 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        Lista<String> lista = new Lista<>(10);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList.lastIndexOf("A"));

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.ultimoIndece("B"));


    }
}

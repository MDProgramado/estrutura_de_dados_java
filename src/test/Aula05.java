package test;

import com.maicon.estruturadados.Vetor;

public class Aula05 {
    public static void main(String[] args) {

        //Busca um elemento de uma posição do vetor
        Vetor vetor = new Vetor(4);
         vetor.adiciona("Elemento 1"); //posição 0
         vetor.adiciona("Elemento 2"); // posição 1
         vetor.adiciona("Elemento 3"); // posição 2

        System.out.println(vetor.busca(15));
    }
}

package test;

import com.maicon.estruturadados.Vetor;

public class Aula06 {
    public static void main(String[] args) {

        //Busca sequencial == Procura para ver se um elemento já existe

        Vetor vetor = new Vetor(10);

        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");

        System.out.println(vetor.busca("Elemento 1"));
    }
}

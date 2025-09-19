package test;

import com.maicon.estruturadados.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

        vetor.adiciona(3, "A");
        System.out.println(vetor);

        System.out.println("Remove Elemento E");
        int pos = vetor.busca("M");
        if (pos > -1) {
            vetor.remove(pos);
        }
        else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}

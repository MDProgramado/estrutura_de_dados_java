package test;

import com.maicon.estruturadados.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");

        vetor.adiciona(3, "A");
        System.out.println(vetor);

        vetor.remove(1);
        System.out.println(vetor);
    }
}

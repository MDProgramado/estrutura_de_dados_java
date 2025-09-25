package test;

import com.maicon.estruturadados.Lista;
import com.maicon.estruturadados.VetorObjetos;

public class Aula11 {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<String>(1);

        vetor.adiciona("Elemento 1");

        System.out.println(vetor);
    }
}

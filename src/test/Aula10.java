package test;

import com.maicon.estruturadados.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(5);

        Contato contato01 = new Contato("Contato 1", "c1@.com", "11 111111");
        Contato contato02 = new Contato("Contato 2", "c2@.com", "22 222222");
        Contato contato03 = new Contato("Contato 3", "c3@.com", "33 333333");

        vetor.adiciona(contato01);
        vetor.adiciona(contato02);
        vetor.adiciona(contato03);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(contato01);

        if (pos > -1 ) {
            System.out.println("Elemento  existe no vetor");
        }
        else {
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetor);
    }
}

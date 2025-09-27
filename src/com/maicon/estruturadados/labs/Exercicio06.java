package com.maicon.estruturadados.labs;

import com.maicon.estruturadados.Lista;
import test.Contato;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        //Criação das variáveis

        Scanner scanner = new Scanner(System.in);
        //criar vetor com 20 capacidade
        Lista<Contato> lista = new Lista<Contato>(20);
        //Criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        //1 - Criar menu para que o usuário escolha uma opção
        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(scanner);
            switch (opcao) {
                case 1:
                adicionarContatoFinal(scanner, lista);
                 break;
                case 2:

                adicionarContatoPosicao(scanner, lista);
                 break;

                case 3:
                    obtemContatoPosicao(scanner, lista);
                 break;

                case 4:
                    obtemContato(scanner, lista);
                    break;

                case 5:
                        pesquisarUlitimoIndice(scanner, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, lista);
                    break;
                case 7:
                    excluirPorPosicao(scanner, lista);
                    break;
                case 8:
                    excluirContato(scanner, lista);
                    break;
                case 9:
                    imprimiTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:

                 break;
            }
        }

        System.out.println("O usuário digitou 0, terminando programa");
    }
    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista){
        lista.limpar();

        System.out.println("Todos os contatos do vetor foram excluídos!");
    }

    private static void imprimiTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    private static void excluirContato(Scanner scanner, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scanner);
        try {
            lista.remove(pos);
            System.out.println("Contato excluído");

        }catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scanner, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser removida", scanner);
        try {
            Contato contato = lista.busca(pos);

            lista.remove(contato);
            System.out.println("Contato excluído");

        }catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scanner);
        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue dados: ");
            System.out.println(contato);

            boolean existe = lista.contem(contato);

            if (existe) {
                System.out.println("Contato existe, segue dados: ");
                System.out.println(contato);
            }
            else {
                System.out.println("Contato não existe");
            }

        }catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUlitimoIndice(Scanner scanner, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scanner);
        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice contato encontrado: ");
            pos = lista.ultimoIndece(contato);

            System.out.println("Contato encontrado na posição " + pos);
        }catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scanner, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scanner);
        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue dados: ");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado: ");
             pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);
        }catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scanner, Lista<Contato> lista){
        int pos = lerInformacaoInt("Entre com a posição a ser pesquisada", scanner);
        try {
            Contato contato = lista.busca(pos);

            System.out.println("Contato existe, segue dados: ");
            System.out.println(contato);
        }catch (Exception e) {
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome", scanner);
        String email = lerInformacao("Entre com o email", scanner);
        String telefone = lerInformacao("Entre com o telefone", scanner);


        Contato contato = new Contato(nome, email, telefone);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }
    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações: ");
        String nome = lerInformacao("Entre com o nome", scanner);
        String email = lerInformacao("Entre com o email", scanner);
        String telefone = lerInformacao("Entre com o telefone", scanner);


        Contato contato = new Contato(nome, email, telefone);

        int pos = lerInformacaoInt("Entre com a posição a adiocionar o contato", scanner);

        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        }catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado!");
        }



    }

    private static String lerInformacao(String msg, Scanner scanner) {
        System.out.println(msg);
        String entrada = scanner.nextLine();
        return entrada;
    }

    private static int lerInformacaoInt(String msg, Scanner scanner){

        boolean entradaValida = false;
        int num = 0;
        while (!entradaValida) {
            try {

                System.out.println(msg);
                String entrada = scanner.nextLine();

                num = Integer.parseInt(entrada);
                entradaValida = true;
            } catch (Exception e) {

            }
        }

        return num;
    }

    private static int obterOpcaoMenu(Scanner scanner) {

        boolean entradaValida = false;
        int opcao = 0;
        String entrada;
        while (!entradaValida){
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato no final da lista");
            System.out.println("2: Adiciona contato em um lugar específico da lista");
            System.out.println("3: Busca o contato de uma posição específica");
            System.out.println("4: Busca por contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se o contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Excluir todos os contatos");
            System.out.println("10: Verifica tamanho");
            System.out.println("11: Imprimi a lista");
            System.out.println("0: Sair");

            try {
                 entrada = scanner.nextLine();
                 opcao = Integer.parseInt(entrada);
                 if (opcao >= 0 && opcao <= 11) {
                     entradaValida = true;
                 }
                 else {
                     throw new Exception();
                 }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n\n");
            }

        }
        return opcao;
    }
    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

        Contato contato;
        for (int i = 1; i < quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setEmail("contato"+i+"@email.com");
            contato.setTelefone("11111111" + i);


            lista.adiciona(contato);
        }
    }
}

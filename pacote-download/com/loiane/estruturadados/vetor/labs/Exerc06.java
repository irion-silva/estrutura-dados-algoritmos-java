/*Exercício 06
Utilize a classe Lista ou Vetor e classe Contato (criada durante as aulas) e 
desenvolva os seguintes items:
1. Crie um vetor com capacidade para 20 contatos;
2. Insira 30 contatos no vetor (isso é possível ser feito através de um loop);
3. Crie um exemplo para utilizar cada método da classe Lista;
 */
package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;
import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-07-12
 * @author irion-silva
 */
public class Exerc06 {

    public static void main(String[] args) {
        //Criação das variáveis
        Scanner teclado = new Scanner(System.in);

        //Criar vetor com 20 de capacidade.
        Lista<Contato> lista = new Lista<Contato>(20);

        //Criar e adicionar 30 contatos.
        criarContatosDinamicamente(5, lista);
        //Criar um menu para que o usuário escolha uma opção.
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(teclado);
            switch (opcao) {
                case 1:
                    adicionarContatoFinal(teclado, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(teclado, lista);
                    break;
                case 3:
                    obtemContatoPosicao(teclado, lista);
                    break;
                case 4:
                    obtemContato(teclado, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(teclado, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(teclado, lista);
                    break;
                case 7:
                    excluirPorPosicao(teclado, lista);
                    break;
                case 8:
                    excluirContato(teclado, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                case 0:
                    break;
                default:

            }
        }
        System.out.println("Usuário digitou 0, programa terminado.");
    }
    
    private static void imprimirVetor(Lista<Contato> lista){
        System.out.println(lista);
    }
    
    private static void limparVetor(Lista<Contato> lista){
        lista.limpar();
        
        System.out.println("Todos os contatos do vetor foram excluídos.");
    }
    
    private static void imprimeTamanhoVetor(Lista<Contato> lista){
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }
    

    private static void excluirContato(Scanner teclado, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", teclado);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);
            
            System.out.println("Contato excluído.");
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }
    
    private static void excluirPorPosicao(Scanner teclado, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", teclado);

        try {
            lista.remove(pos);
            
            System.out.println("Contato excluído.");
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }
    
    private static void pesquisarContatoExiste(Scanner teclado, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", teclado);

        try {
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

            if (existe) {
                System.out.println("Contato existe, seguem os dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe.");
            }
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }

    private static void pesquisarUltimoIndice(Scanner teclado, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", teclado);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem os dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void obtemContato(Scanner teclado, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", teclado);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem os dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void obtemContatoPosicao(Scanner teclado, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", teclado);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem os dados:");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        }
    }

    private static void adicionarContatoFinal(Scanner teclado, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", teclado);
        String telefone = leInformacao("Entre com o telefone", teclado);
        String email = leInformacao("Entre com o e-mail", teclado);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner teclado, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");
        String nome = leInformacao("Entre com o nome", teclado);
        String telefone = leInformacao("Entre com o nome", teclado);
        String email = leInformacao("Entre com o e-mail", teclado);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", teclado);

        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado.");
        }

    }

    private static int leInformacaoInt(String msg, Scanner teclado) {
        boolean entradaValida = false;
        int num = 0;

        while (!entradaValida) {
            try {
                System.out.println(msg);
                String entrada = teclado.nextLine();

                num = Integer.parseInt(entrada);

                entradaValida = true;
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }
        return num;

    }

    private static String leInformacao(String msg, Scanner teclado) {
        System.out.println(msg);
        String entrada = teclado.nextLine();

        return entrada;
    }

    private static int obterOpcaoMenu(Scanner teclado) {
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;

        while (!entradaValida) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtém contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try {
                entrada = teclado.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente \n\n");
            }
        }

        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;
        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111" + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}

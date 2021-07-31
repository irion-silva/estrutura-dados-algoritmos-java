/*Exercício 02
Escreva um programa que leia 10 números. Para cada número lido, verifique e 
codifique de acordo com as regras a seguir:
- Se o número for par, empilhe na pilha chamada par;
- Se o número for ímpar, empilhe na pilha chamada impar;
- Se o número for zero (0), desempilhe um element de cada pilha. Caso alguma 
pilha esteje vazia, mostre uma mensagem de erro ne tela.
Ao final do programa desempilhe todos os elementos das duas pilhas, 
imprimindo-os na tela
 */
package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;
import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-07-26
 * @author irion-silva
 */
public class Exerc02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe um número:");
            int num = input.nextInt();

            if (num == 0) {
                //pilhar par
                Integer desempilhado = par.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha par vázia.");
                } else {
                    System.out.println("Desempilhando da pilha par: " + desempilhado);
                }

                //pilha ímpar
                desempilhado = impar.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha ímpar vázia.");
                } else {
                    System.out.println("Desempilhando da pilha ímpar: " + desempilhado);
                }
            } else if (num % 2 == 0) {
                System.out.println("Empilhando o número na pilha par: " + num);
                par.empilha(num);
            } else {
                System.out.println("Empilhando o número na pilha ímpar: " + num);
                impar.empilha(num);
            }
        }
        System.out.println("Todos os números foram lidos, desempilhando números das pilhas");
        
        while (!par.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha par: " + par.desempilha());
        }
        
        while (!impar.estaVazia()) {
            System.out.println("Desempilhando um elemento da pilha ímpar: " + impar.desempilha());
        }

        System.out.println("Todos os elementos das pilhas foram desempilhados.");

    }

}

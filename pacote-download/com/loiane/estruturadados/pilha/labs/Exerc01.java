/*Exercício 01
Escreva um programa que leia 10 números. Para cada número lido, verifique e 
codifique de acordo com as regras a seguir:
- Se o número for par, empilhe na pilha;
- Se o número for ímpar, desempilhe um número da pilha. Caso a pilha esteja 
vazia, mostre uma mensagem
- Se ao final do programa a pilha não estiver vazia, desempilhe todos os 
elementos, imprimindo-os na tela
 */
package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;
import java.util.Scanner;

/**
 * @version 1.0
 * @since 2021-07-23
 * @author irion-silva
 */
public class Exerc01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pilha<Integer> pilha = new Pilha<Integer>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe um número:");
            int num = input.nextInt();

            if (num % 2 == 0) {
                System.out.println("Empilhando o número: " + num);
                pilha.empilha(num);
            } else {
                Integer desempilhado = pilha.desempilha();

                if (desempilhado == null) {
                    System.out.println("Pilha está vázia.");
                } else {
                    System.out.println("Número ímpar, desempilhando um elemento da pilha: " + desempilhado);
                }
            }
        }

        System.out.println("Todos os números da pilha foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()) {
                System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }
        
        System.out.println("Todos os elementos da pilha foram desempilhados.");
    }
}

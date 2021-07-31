/*Exercício 05 – Desafio do Palímdromo
Escreva um programa que testa se uma sequência de caracteres fornecida pelo 
usuário é um palíndromo, ou seja, é uma palavra cuja primeira metade é simétrica
à segunda metade. Veja alguns exemplos:
- AABCCBAA - sim
- ADDFDDA - sim
- ABFFBB - não
 */
package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

/**
 * @version 1.0
 * @since 2021-07-29
 * @author irion-silva
 */
public class Exerc05 {

    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");
    }
    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é um Palíndromo? " + testaPalindromo(palavra));
    }
    
    public static boolean testaPalindromo(String palavra){
        Pilha<Character> pilha = new Pilha<Character>();
        
        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilha(palavra.charAt(i));
        }
        
        String palavraInversa = "";
        while (!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }
        
        if (palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }
        return false;
    }
}

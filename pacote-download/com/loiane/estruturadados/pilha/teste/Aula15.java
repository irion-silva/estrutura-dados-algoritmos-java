package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

/**
 * @version 1.0
 * @since 2021-07-19
 * @author irion-silva
 */
public class Aula15 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        System.out.println(pilha.estaVazia());
        
        pilha.empilha(1);
        
        System.out.println(pilha.estaVazia());
    }
}

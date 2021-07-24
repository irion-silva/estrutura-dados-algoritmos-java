package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

/**
 * @version 1.0
 * @since 2021-07-21
 * @author irion-silva
 */
public class Aula17 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);
        
        System.out.println(pilha);
        
        System.out.println("Desempilhando elemento "+ pilha.desempilha());
        
        System.out.println(pilha);

    }

}

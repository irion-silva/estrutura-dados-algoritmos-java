/*Desenfileirar (remover) elemento da fila (dequeue)
 */
package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

/**
 * @version 1.0
 * @since 2021-08-12
 * @author irion-silva
 */
public class Aula22 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);
        
        System.out.println(fila);
        
        System.out.println(fila.desenfileira());
        
        System.out.println(fila);
        
        System.out.println(fila.desenfileira());
        
        System.out.println(fila);
        
        System.out.println(fila.desenfileira());
        
        System.out.println(fila);
    }

}

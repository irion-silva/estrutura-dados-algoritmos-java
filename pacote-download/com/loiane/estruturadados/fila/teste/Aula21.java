/*Espiar/Verificar elemento início da fila (peek)
 */
package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

/**
 * @version 1.0
 * @since 2021-08-11
 * @author irion-silva
 */
public class Aula21 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        
        fila.enfileira(3);
        fila.enfileira(1);
        fila.enfileira(2);
        
        System.out.println(fila.espiar());
        
        System.out.println(fila.toString());
        
    }

}

/*Filas: Introdução
 */
package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

/**
 * @version 1.0
 * @since 2021-08-09
 * @author irion-silva
 */
public class Aula19 {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        
        System.out.println(fila.estaVazia());
        System.out.println(fila.tamanho());
    }

}

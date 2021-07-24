/*Exercício 01:
Melhore a classe Lista e implemente o método contém, semelhando ao método 
contains da classe ArrayList.
 */
package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

/**
 * @version 1.0
 * @since 2021-07-01
 * @author irion-silva
 */
public class Exerc01 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        
        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }

}

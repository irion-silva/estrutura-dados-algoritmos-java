/*Exercício 03
Melhore a classe Lista e implemente o método remove(T elemento), onde sera 
possível remover um elemento da lista passando o mesmo como parâmetro.
 */
package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

/**
 * @version 1.0
 * @since 2021-07-05
 * @author irion-silva
 */
public class Exerc03 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        
        System.out.println(lista);
        
        lista.remove("A");
        
        System.out.println(lista);
        
        lista.remove("E");
        
        System.out.println(lista);
        
        lista.remove("C");
        
        System.out.println(lista);
    }

}

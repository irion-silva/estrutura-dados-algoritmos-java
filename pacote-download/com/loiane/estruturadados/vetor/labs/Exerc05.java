/*Exercício 05
Melhore a classe Lista e implemente o método limpar, onde todos os elementos da 
lista são removidos.Esse método é semelhante ao método clear da classe ArrayList.
 */
package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

/**
 * @version 1.0
 * @since 2021-07-07
 * @author irion-silva
 */
public class Exerc05 {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        
        System.out.println(lista);
        
        lista.limpar();
        
        System.out.println(lista);

    }

}

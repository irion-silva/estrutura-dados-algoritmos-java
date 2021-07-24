/*Exercício 02:
Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método 
lastIndexOf da classe ArrayList.
 */
package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;
import java.util.ArrayList;

/**
 * @version 1.0
 * @since 2021-07-02
 * @author irion-silva
 */
public class Exerc02 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(5);
        
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");
        
        System.out.println(arrayList.lastIndexOf("A"));
        
        Lista<String> lista = new Lista<String>(5);
        
        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");
        
        System.out.println(lista.ultimoIndice("A"));
        
    }

}

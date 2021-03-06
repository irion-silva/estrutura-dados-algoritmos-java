/*API Java: Queue
 */
package com.loiane.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @version 1.0
 * @since 2021-08-13
 * @author irion-silva
 */
public class Aula23 {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(1); //enqueue
        fila.add(2);
        
        System.out.println(fila);
        
        System.out.println(fila.peek()); //espiar
        
        System.out.println(fila.remove()); //dequeue - desenfileirar
        
        System.out.println(fila);
    }

}

/*
API Java: Stack
 */
package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;
import java.util.Stack;

/**
 * @version 1.0
 * @since 2021-07-22
 * @author irion-silva
 */
public class Aula18 {

    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        
        Stack<Integer> stack = new Stack<Integer>();
        
        System.out.println(stack.isEmpty());
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);
        
        System.out.println(stack.peek());
        
        System.out.println(stack.pop());
        
        System.out.println(stack);
    }
}

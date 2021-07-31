/*Exercício 04
Repita o mesmo processo do exercício anterior, porém utilizando a classe Stack 
da API Java.
 */
package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

/**
 * @version 1.0
 * @since 2021-07-28
 * @author irion-silva
 */
public class Exerc04 {

    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<Livro>();

        Livro livro1 = new Livro();
        livro1.setNome("Código limpo: Habilidades práticas do Agile Software");
        livro1.setAutor("Robert C. Martin");
        livro1.setAnoLancamento(2009);
        livro1.setIsbn("8576082675");

        Livro livro2 = new Livro();
        livro2.setNome("Domain-Driven Design: Atacando as complexidades no coração do software");
        livro2.setAutor("Eric Evans");
        livro2.setAnoLancamento(2016);
        livro2.setIsbn("8550800651");

        Livro livro3 = new Livro();
        livro3.setNome("Introduction to Algorithms");
        livro3.setAutor("Thomas H. Cormen, Charles E. Leiserson");
        livro3.setAnoLancamento(2009);
        livro3.setIsbn("9780262033848");

        Livro livro4 = new Livro();
        livro4.setNome("Java: Como Programar");
        livro4.setAutor("Paul Deitel, Harvey Deitel");
        livro4.setAnoLancamento(2016);
        livro4.setIsbn("8543004799");

        Livro livro5 = new Livro();
        livro5.setNome("Java efetivo: as melhores práticas para a plataforma Java");
        livro5.setAutor("Joshua Bloch");
        livro5.setAnoLancamento(2019);
        livro5.setIsbn("8550804622");

        Livro livro6 = new Livro();
        livro6.setNome("Use a cabeça!: Java");
        livro6.setAutor("Bert Bates, Kathy Sierra");
        livro6.setAnoLancamento(2007);
        livro6.setIsbn("8576081733");

        System.out.println("Pilha de livros criada, pilha está vázia? " + pilha.isEmpty());

        System.out.println("Empilhando livros na pilha.");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);
        pilha.push(livro6);

        System.out.println(pilha.size()+ " livros foram empilhados.");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vázia? " + pilha.isEmpty());
        
        System.out.println("Espiano o topo da pilha " + pilha.peek());
        
        System.out.println("Desempilhando livros da pilha:");
        
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando livro: " + pilha.pop());
        }
        
        System.out.println("Todos os livros foram desempilhados, pilha vázia? " + pilha.isEmpty());
        
    }
}

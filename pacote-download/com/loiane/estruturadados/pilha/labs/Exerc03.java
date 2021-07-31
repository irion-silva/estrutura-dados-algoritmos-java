/*Exercício 03
Utilize a classe Pilha (criada durante as aulas) e desenvolva os seguintes items:
1. Crie uma pilha com capacidade para 20 livros;
2. Insira 6 livros na pilha; Cada livro contém nome, isbn, ano de lançamento e 
autor.
3. Crie um exemplo para utilizar cada método da classe Pilha.
 */
package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

/**
 * @version 1.0
 * @since 2021-07-27
 * @author irion-silva
 */
public class Exerc03 {

    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<Livro>(20);

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

        System.out.println("Pilha de livros criada, pilha está vázia? " + pilha.estaVazia());

        System.out.println("Empilhando livros na pilha.");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);
        pilha.empilha(livro5);
        pilha.empilha(livro6);

        System.out.println(pilha.tamanho() + " livros foram empilhados.");
        System.out.println(pilha);

        System.out.println("Pilha de livros criada, pilha está vázia? " + pilha.estaVazia());
        
        System.out.println("Espiano o topo da pilha " + pilha.topo());
        
        System.out.println("Desempilhando livros da pilha:");
        
        while (!pilha.estaVazia()) {
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }
        
        System.out.println("Todos os livros foram desempilhados, pilha vázia? " + pilha.estaVazia());
        
    }
}

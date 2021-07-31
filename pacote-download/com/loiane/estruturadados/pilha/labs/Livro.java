/*Exercício 03
Utilize a classe Pilha (criada durante as aulas) e desenvolva os seguintes items:
1. Crie uma pilha com capacidade para 20 livros;
2. Insira 6 livros na pilha; Cada livro contém nome, isbn, ano de lançamento e 
autor.
3. Crie um exemplo para utilizar cada método da classe Pilha.
 */
package com.loiane.estruturadados.pilha.labs;

/**
 * @version 1.0
 * @since 2021-07-21
 * @author irion-silva
 */
public class Livro {
    //Atributos
    private String nome;
    private String isbn;
    private int anoLancamento;
    private String autor;
    
    //Construtor
    public Livro(){
        super();
    }

    public Livro(String nome, String isbn, int anoLancamento, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.anoLancamento = anoLancamento;
        this.autor = autor;
    }
    

    
    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    //toString

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", ISBN=" + isbn + ", Ano de lancamento=" + anoLancamento + ", Autor=" + autor + '}';
    }

   
    
    
}

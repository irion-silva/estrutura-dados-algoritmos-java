package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

/**
 * @version 1.0
 * @since 2021-07-15
 * @author irion-silva
 */
public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha(){
        super();
    }
    
    public Pilha(int capacidade){
        super(capacidade);
    }
    
    public void empilha(T elemento){
        super.adiciona(elemento);
    }
    
    public T topo(){
        if (estaVazia()) {
            return null;
        }
        return this.elementos[tamanho-1];
    }
    
    public T desempilha(){
        if (estaVazia()){
            return null;
        }
        
        /*T elemento = this.elementos[tamanho-1];
        tamanho--;
        
        return elemento;*/
        
        return this.elementos[--tamanho];
    }
}

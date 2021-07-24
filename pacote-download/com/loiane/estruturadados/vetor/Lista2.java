package com.loiane.estruturadados.vetor;

import com.loiane.estruturadados.base.EstruturaEstatica;

/**
 * @version 1.0
 * @since 2021-07-15
 * @author irion-silva
 */
public class Lista2<T> extends EstruturaEstatica<T> {
    public Lista2(){
        super();
    }
    
    public Lista2(int capacidade){
        super(capacidade);
    }
    
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }
    
    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}

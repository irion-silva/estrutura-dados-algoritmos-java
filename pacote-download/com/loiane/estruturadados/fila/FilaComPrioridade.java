/*Filas com Prioridade
 */
package com.loiane.estruturadados.fila;

/**
 * @version 1.0
 * @since 2021-08-17
 * @author irion-silva
 */
public class FilaComPrioridade<T> extends Fila<T> {

    @Override
    public void enfileira(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        
        int i;
        for (i=0; i<this.tamanho; i++) {
            if (chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adiciona(i, elemento);
    }

}

/* Curso Estrutura de Dados e Algoritmos Java 
Aula 12 - API Java: Array List (https://loiane.training/) */
package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

/**
 * @version 1.0
 * @since 2021-06-30
 * @author irion-silva
 */
public class Aula12 {

    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        
        arrayList.add("A"); // Adiciona elemento ao Array.
        arrayList.add("C"); // Adiciona elemento ao Array.
        
        System.out.println(arrayList);
        
        arrayList.add(1, "B"); // Adiciona elemento por posição ao Array.
        
        System.out.println(arrayList);
        
        boolean existe = arrayList.contains("A"); // Verifica se elemento existe no Array.
        if (existe) {
            System.out.println("Elemento existe no array.");
        } else {
            System.out.println("Elemento não existe no array.");
        }
        
        int pos = arrayList.indexOf("B"); // Verifica se elemento existe no Array.
        if (pos > -1) {
            System.out.println("Elemento existe no array. " + pos);
        } else {
            System.out.println("Elemento não existe no array. " + pos);
        }
        
        System.out.println(arrayList.get(2));
        
        arrayList.remove(0); // Remove elemento por posição.
        arrayList.remove("B"); // Remove elemento por objeto.
        
        System.out.println(arrayList);
        
        System.out.println(arrayList.size()); // Tamanho do Array.
       
    }

}

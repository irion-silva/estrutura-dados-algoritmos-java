package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        } catch (Exception ex) {
            Logger.getLogger(Aula03.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho;

import java.util.ArrayList;


public class Curso {
    private String nome;
    
    private ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

    public String getNome() {
        return nome;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }
    
    
}

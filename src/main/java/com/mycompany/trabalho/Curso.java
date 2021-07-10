/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho;

import java.util.ArrayList;

/**
 *
 * @author RUBEUS
 */
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

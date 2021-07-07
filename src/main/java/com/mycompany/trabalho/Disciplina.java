/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho;

import com.mycompany.trabalho.professor.Professor;

/**
 *
 * @author RUBEUS
 */
public class Disciplina {
    private String nome;
    private String horario;
    private Professor professor; 

    public Disciplina(String nome, String horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
    }
    
}

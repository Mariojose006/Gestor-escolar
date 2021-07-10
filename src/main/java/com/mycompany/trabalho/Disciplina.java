/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho;

import com.mycompany.trabalho.professor.Professor;


public class Disciplina {
    private String nome;
    private String horario;
    private Professor professor; 

    public Disciplina(String nome, String horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
}

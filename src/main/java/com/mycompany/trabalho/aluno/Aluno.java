/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho.aluno;

import com.mycompany.trabalho.Curso;
import com.mycompany.trabalho.Pessoa;

 

public class Aluno extends Pessoa{
   
   private Curso curso;  

    public Aluno(Curso curso, String nome, String email, String telefone, String login, String senha) {
        super(nome, email, telefone, login, senha);
        this.curso = curso;
    }
}

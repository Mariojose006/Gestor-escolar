/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho.aluno;

import com.mycompany.trabalho.Curso;
import com.mycompany.trabalho.Pessoa;

 
/**
 *
 * @author RUBEUS
 */
public class Aluno extends Pessoa{
   
   private Curso curso;  

    public Aluno(Curso curso, String nome, String email, String telefone, String login, String senha) {
        super(nome, email, telefone, login, senha);
        this.curso = curso;
    }
}
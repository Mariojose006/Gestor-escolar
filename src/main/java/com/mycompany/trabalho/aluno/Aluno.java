/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho.aluno;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.trabalho.Curso;
import com.mycompany.trabalho.Pessoa;

 

public class Aluno extends Pessoa{
   
   private Curso curso; 
   private int notas[];

    

    public Aluno(Curso curso, String nome, String email, String telefone, String login, String senha) {
        super(nome, email, telefone, login, senha);
       

    }

    public Aluno() {
    }

    
    public int[] getNotas() {
        return notas;
    }

    
    public void setNotas(int[] notas) {
        this.notas = notas;
    }
   
   public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    //toJson
    public String toJSON() {
        Aluno alunoAux = new Aluno(getCurso(), getNome(), getEmail(), getTelefone(), getLogin(), getSenha());
    	Gson gson = new Gson();
        String json = gson.toJson(alunoAux);
        return json;
    }
    
    public static String toJSON(List<Aluno> alunos) {
        Gson gson = new Gson();
        String json = gson.toJson(alunos);
        return json;
    }
    
    public static Aluno toAluno(String conteudo) {
        Gson gson = new Gson();
        Aluno aluno = gson.fromJson(conteudo, Aluno.class);

        return aluno;
    }

    public static List<Aluno> toAlunos(String conteudo) {
        Gson gson = new Gson();
        Type pessoasTipo = new TypeToken<ArrayList<Aluno>>() {
        }.getType();	
        List<Aluno> alunos = gson.fromJson(conteudo, pessoasTipo);

        return alunos;
    }

}
    
    
    

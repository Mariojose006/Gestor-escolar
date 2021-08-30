/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho.adm;

import com.google.gson.Gson;
<<<<<<< HEAD
import com.mycompany.trabalho.Pessoa;
import com.mycompany.trabalho.aluno.Aluno;
=======
import com.google.gson.reflect.TypeToken;
import com.mycompany.trabalho.Pessoa;
import java.lang.reflect.Type;
import java.util.ArrayList;
>>>>>>> main
import java.util.List;

public class Administrador extends Pessoa{
    
    public Administrador(String nome, String email, String telefone, String login, String senha) {
        super(nome, email, telefone, login, senha);
    }
<<<<<<< HEAD
    
    public String toJSON() {
        Administrador admAux = new Administrador(this.getNome(), this.getEmail(), this.getTelefone(), this.getLogin(), this.getSenha());
    	Gson gson = new Gson();
        String json = gson.toJson(admAux);
        return json;
    }
    
    public static String toJSON(List<Administrador> administradores) {
        Gson gson = new Gson();
        String json = gson.toJson(administradores);
        return json;
    }
    
=======

    public Administrador() {
    }

    @Override
    public String toString() {
        return "Administrador{" + '}';
    }
    public String toJSON() {
        Administrador alunoAux = new Administrador( getNome(), getEmail(), getTelefone(), getLogin(), getSenha());
    	Gson gson = new Gson();
        String json = gson.toJson(alunoAux);
        return json;
    }
    
    public static String toJSON(List<Administrador> alunos) {
        Gson gson = new Gson();
        String json = gson.toJson(alunos);
        return json;
    }
    
    public static Administrador toAluno(String conteudo) {
        Gson gson = new Gson();
        Administrador adm = gson.fromJson(conteudo, Administrador.class);

        return adm;
    }

    public static List<Administrador> toAlunos(String conteudo) {
        Gson gson = new Gson();
        Type pessoasTipo = new TypeToken<ArrayList<Administrador>>() {
        }.getType();	
        List<Administrador> adm = gson.fromJson(conteudo, pessoasTipo);

        return adm;
    }
>>>>>>> main
}

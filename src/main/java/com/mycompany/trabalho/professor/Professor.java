/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho.professor;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.trabalho.Pessoa;

public class Professor extends Pessoa{
    
    public Professor(String nome, String email, String telefone, String login, String senha) {
        super(nome, email, telefone, login, senha);
    }
    
    public String toJSON() {
        Professor professorAux = new Professor(getNome(), getEmail(), getTelefone(), getLogin(), getSenha());
    	Gson gson = new Gson();
        String json = gson.toJson(professorAux);
        return json;
    }
    
    public static String toJSON(List<Professor> professores) {
        Gson gson = new Gson();
        String json = gson.toJson(professores);
        return json;
    }
    
    public static Professor toProfessor(String conteudo) {
        Gson gson = new Gson();
        Professor professor = gson.fromJson(conteudo, Professor.class);

        return professor;
    }

    public static List<Professor> toProfessores(String conteudo) {
        Gson gson = new Gson();
        Type professorTipo = new TypeToken<ArrayList<Professor>>() {
        }.getType();	
        List<Professor> professores = gson.fromJson(conteudo, professorTipo);

        return professores;
    }
    
    
}

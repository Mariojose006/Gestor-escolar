/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */

package com.mycompany.trabalho;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class Curso {
    private String nome;
    private String disciplinas[];
    
    
    

    public Curso(String nome, String[] disciplinas) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
	}

	public String getNome() {
        return nome;
    }

    /**
     * @return the disciplinas
     */
    public String[] getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String toJSON() {
        Curso cursoAux = new Curso(getNome(), getDisciplinas());
    	Gson gson = new Gson();
        String json = gson.toJson(cursoAux);
        return json;
    }
    
    public static String toJSON(List<Curso> cursos) {
        Gson gson = new Gson();
        String json = gson.toJson(cursos);
        return json;
    }
    
    public static Curso toCurso(String conteudo) {
        Gson gson = new Gson();
        Curso curso = gson.fromJson(conteudo, Curso.class);

        return curso;
    }

    public static List<Curso> toCursos(String conteudo) {
        Gson gson = new Gson();
        Type cursosTipo = new TypeToken<ArrayList<Curso>>() {
        }.getType();	
        List<Curso> cursos = gson.fromJson(conteudo, cursosTipo);

        return cursos;
    }
    
    
}

/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.trabalho.aluno.Aluno;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Pessoa {
	private static int idAtual = 0;
	private int id;
    private String nome;
    private String email;
    private String telefone;
    private String login;
    private String senha;

    public Pessoa(String nome, String email, String telefone, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
        this.id = idAtual++;
    }

    public Pessoa() {
    }
    
    
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //toJson

    
    public static Pessoa toPessoa(String conteudo) {
        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(conteudo, Pessoa.class);

        return pessoa;
    }

    public static List<Pessoa> toPessoas(String conteudo) {
        Gson gson = new Gson();
        Type pessoasTipo = new TypeToken<ArrayList<Pessoa>>() {
        }.getType();	
        List<Pessoa> pessoas = gson.fromJson(conteudo, pessoasTipo);

        return pessoas;
    }
    
    
}

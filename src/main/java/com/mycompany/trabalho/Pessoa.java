/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho;


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
    	this.id = idAtual++;
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
    
    
    
}

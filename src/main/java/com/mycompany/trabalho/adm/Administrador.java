/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho.adm;

import com.google.gson.Gson;
import com.mycompany.trabalho.Pessoa;
import com.mycompany.trabalho.aluno.Aluno;
import java.util.List;

public class Administrador extends Pessoa{
    
    public Administrador(String nome, String email, String telefone, String login, String senha) {
        super(nome, email, telefone, login, senha);
    }
    
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
    
}

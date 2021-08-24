package entidades;

import java.util.List;	
import com.google.gson.Gson;
import com.mycompany.trabalho.Pessoa;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Json {
	 public static String toJSON(Object pessoa) {
	        Gson gson = new Gson();
	        String json = gson.toJson(pessoa);
	        return json;
	    }

	    public static String toJSON(List<Pessoa> contatos) {
	        Gson gson = new Gson();
	        String json = gson.toJson(contatos);
	        return json;
	    }

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


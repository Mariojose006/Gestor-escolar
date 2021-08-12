/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Entidades {

    public Entidades() {
    	
    	
    }

   public static void escrever(Object objeto, String path) throws IOException {
	   Gson gson = new Gson();
	   String json = gson.toJson(objeto);
	   try {
			FileWriter writer = new FileWriter(path);
			writer.write(json);
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(json);

	    }
	public static Object ler(String path) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson gson = new Gson();
	    
	    // 1. JSON file to Java object
	    Object object = gson.fromJson(new FileReader(path), Object.class);
	    
	    return object;
	}
	
   }


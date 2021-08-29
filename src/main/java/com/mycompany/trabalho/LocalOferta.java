/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho;

import com.google.gson.Gson;


public class LocalOferta {
        private String sala;

    public LocalOferta(String sala) {
        this.sala = sala;
    }
    public LocalOferta() {
    }
    

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
       
    public String toJSON() {
        LocalOferta localAux = new LocalOferta(getSala());
    	Gson gson = new Gson();
        String json = gson.toJson(localAux);
        return json;
    }
}

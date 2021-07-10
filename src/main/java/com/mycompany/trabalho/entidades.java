/*
 * Ádrian Pereira Machado - 201965001AB
   Mário José da Silva Neto - 201965507B
 */
package com.mycompany.trabalho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class entidades {

    public entidades() {
    }

    public static void escrever(String valor[], String classe, int n) throws IOException {
        
        int i; 
        FileWriter arq = new FileWriter("d:\\" + classe + ".txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (i = 1; i <= n; i++) {
            gravarArq.printf("%n", valor[i] + ";");
        }
        arq.close();

        System.out.printf("\nOs dados da classe " + classe + "  \"d:\\" + classe +".txt  \".\n");
    }

   public static void escrever(String valor[]) throws IOException {
       //leitura do arquivo
   }
   }


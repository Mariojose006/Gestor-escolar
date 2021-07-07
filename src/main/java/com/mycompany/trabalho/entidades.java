/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabalho;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class entidades {

    public entidades() {
    }

    public static void escrever(String valor[], String classe, int n) throws IOException {
        
        int i; 
        FileWriter arq = new FileWriter("d:\\" + classe + ".txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (i = 1; i <= n; i++) {
            gravarArq.printf("%n", valor[i]);
        }
        arq.close();

        System.out.printf("\nOs dados da classe " + classe + "  \"d:\\" + classe +".txt  \".\n");
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o nome de um arquivo ou diretório:\n");
        String nome = ler.nextLine();

        File objFile = new File(nome);
        if (objFile.exists()) {
            if (objFile.isFile()) {
                System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n",
                        objFile.getName(), objFile.length());
            } else {
                System.out.printf("\nConteúdo do diretório:\n");
                String diretorio[] = objFile.list();
                for (String item : diretorio) {
                    System.out.printf("%s\n", item);
                }
            }
        } else {
            System.out.printf("Erro: arquivo ou diretório informado não existe!\n");
        }
    }
}

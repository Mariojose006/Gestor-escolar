package entidades;

import com.mycompany.trabalho.aluno.Aluno;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Arquivo {
	public static ArrayList lerArquivo(String caminho) throws FileNotFoundException {
        ArrayList leitura = new ArrayList();
        try{
           //StringBuilder conteudo = new StringBuilder();
       
        File arquivo = new File(caminho);

        Scanner leitor = new Scanner(arquivo);

        // varrendo o conteúdo do arquivo linha por linha
        while (leitor.hasNextLine()) {              
              // conteudo.append(leitor.nextLine()).append("\r\n");
              leitura.add((leitor.nextLine()));
         }

        
        }
        catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado!" + caminho);
            
        }
        return leitura;
        }

    public static void escreverArquivo(String caminho, String conteudo) {
        FileWriter fwArquivo;
        BufferedWriter bwArquivo;
        try {
            File arquivo = new File(caminho);

            //Se o arquivo já existir, então abrir para concatenação, caso contrário criar novo arquivo
            fwArquivo = new FileWriter(arquivo, true);
            //fwArquivo.append(conteudo + "\r\n");
            bwArquivo = new BufferedWriter(fwArquivo);
            
            // escrevendo String no arquivo e adicionando caracter para criar nova linha
            bwArquivo.write(conteudo + "\r\n");

            // fechando o arquivo
            bwArquivo.close();
            fwArquivo.close();

        } catch (IOException e) {
            System.err.println("Erro ao tentar escrever no arquivo: " + e.toString());
        }
    }

}

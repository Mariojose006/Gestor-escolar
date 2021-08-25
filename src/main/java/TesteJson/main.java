package TesteJson;

import com.mycompany.trabalho.aluno.Aluno;

import entidades.Arquivo;
import java.io.FileNotFoundException;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno(null, "Adrian", "adria@ice.ufjf.br", "32998040251", "adrian", "adrian");
		Arquivo.escreverArquivo("./dadosAlunos.txt", aluno1.toJSON());
		
		Aluno aluno2 = new Aluno(null, "Mario", "mario@ufjf.br", "329980452", "mario", "mario");
		Arquivo.escreverArquivo("./dadosAlunos.txt", aluno2.toJSON());
                
                
                System.out.print(Arquivo.lerArquivo("./dadosAlunos.txt"));
                
	}

}

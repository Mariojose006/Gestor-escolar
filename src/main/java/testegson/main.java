package testegson;
import java.io.IOException;

import com.mycompany.trabalho.Entidades;
import com.mycompany.trabalho.Pessoa;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Pessoa aluno1 = new Pessoa("Adrian","adrianpereira@ice.ufjf","32998040251","201965001AB","adria");
		Entidades.escrever(aluno1, "./teste.json");
		
	}

}

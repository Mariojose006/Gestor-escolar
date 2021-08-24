package entidades;

import com.mycompany.trabalho.Curso;
import com.mycompany.trabalho.Pessoa;
import com.mycompany.trabalho.aluno.Aluno;
import com.mycompany.trabalho.professor.Professor;

public class Util {
	public static void cadastraAluno(Aluno aluno) {
		
	}
	public static void cadastraProfessor(Professor professor) {
		Arquivo.escreverArquivo("COLCOAR CAMINHO AQUI",toJSON((Pessoa)professor));
	}
	public static void cadastraCurso(Curso curso) {
		Arquivo.escreverArquivo("COLCOAR CAMINHO AQUI", toJSON(curso));
	}
	public static void validaLogin(String usuario,String senha) {
		
	}
}

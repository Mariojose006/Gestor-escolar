package TesteJson;



import com.mycompany.trabalho.professor.Professor;
import entidades.Arquivo;
import entidades.util;
import java.io.FileNotFoundException;


public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Aluno aluno1 = new Aluno(null, "Adrian", "adria@ufjf.br", "32998040251", "adrian", "adrian");
		//Arquivo.escreverArquivo("./dadosAlunos.txt", aluno1.toJSON());
		
		//Aluno aluno2 = new Aluno(null, "Mario", "mario@ufjf.br", "329980452", "mario", "mario");
		//Arquivo.escreverArquivo("./dadosAlunos.txt", aluno2.toJSON());
                
                //Aluno aluno3 = new Aluno(null, "Gleiph", "gleiph@ufjf.br", "3299545256", "gleiph", "gleiph");
                //Arquivo.escreverArquivo("./dadosAlunos.txt", aluno3.toJSON());
                
                //System.out.print(Arquivo.lerArquivo("./dadosAlunos.txt"));
                
                //List<Aluno> alunos = Aluno.toAlunos("./dadosAlunos.txt");
                
                Professor prof3 = new Professor("TesteProfessor", "gleiph@ufjf.br", "3299545256", "TesteProfe", "Profe");
                Arquivo.escreverArquivo("./dadosProfessores.txt", prof3.toJSON());
                
                boolean a = util.validaLogin("TesteProfe", "Profe");
                
                
	}

}

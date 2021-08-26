package entidades;

import com.mycompany.trabalho.Pessoa;
import com.mycompany.trabalho.aluno.Aluno;
import com.mycompany.trabalho.professor.Professor;
import java.util.ArrayList;
import java.util.List;

public class util {
	public static boolean validaLogin(String usuario, String senha) {
            //criar duas listas
            ArrayList<Aluno> alunos = new ArrayList<Aluno>();
            alunos.addAll(Aluno.toAlunos("./dadosAlunos.txt"));
            
            System.out.println(alunos.get(1).toString());
            
            ArrayList<Professor> professores = new ArrayList<Professor>();
            professores.addAll(Professor.toProfessores("./dadosAlunos.txt"));
            
            //contatenar as duas listas
            ArrayList<Pessoa> usuarios = new ArrayList<Pessoa>();
            usuarios.addAll(alunos);
            usuarios.addAll(professores);
            
            //achar usuario
            for(Pessoa a :usuarios){
                //compara se algum usuario é igual ao passado no parametro
                if(a.getLogin().equals(usuario)){
                    //vê se a senha está certa
                    if(a.getSenha().equals(senha)){
                        return true;
                    }
                    else{
                        //caixa de texto !!senha invalida
                    }
                }
                //caixa de texto !!usuario não encontrado
            }
            
            
            return false;
}
}
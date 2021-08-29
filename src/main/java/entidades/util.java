package entidades;

import com.mycompany.trabalho.Pessoa;
import com.mycompany.trabalho.adm.Administrador;
import com.mycompany.trabalho.adm.FrameAdm;
import com.mycompany.trabalho.aluno.Aluno;
import com.mycompany.trabalho.aluno.FrameAluno;
import com.mycompany.trabalho.professor.FrameProfessor;
import com.mycompany.trabalho.professor.Professor;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class util {
	public static boolean validaLogin(String usuario, String senha) throws FileNotFoundException {
            //criar duas listas
            ArrayList<String> alunos = new ArrayList<String>();
            alunos.addAll(Arquivo.lerArquivo("./dadosAlunos.txt"));
                       
            ArrayList<String> professores = new ArrayList<String>();
            professores.addAll(Arquivo.lerArquivo("./dadosProfessores.txt"));
            
            ArrayList<String> administrador = new ArrayList<String>();
            administrador.addAll(Arquivo.lerArquivo("./dadosAdministrador.txt"));
          
            //contatenar as duas listas
            ArrayList<String> usuarios = new ArrayList<String>();
            usuarios.addAll(alunos);
            usuarios.addAll(professores);
            usuarios.addAll(administrador);
            //achar usuario
            int tam = usuarios.size();
            Pessoa p = new Pessoa() ;
            boolean s = false,l = false;
            for(int i = 0; i<= (tam - 1);i++)
            {
                p = Pessoa.toPessoa(usuarios.get(i));
                //System.out.println(al.getLogin());
                if(p.getLogin().equals(usuario)  && p.getSenha().equals(senha) && p.getLogin().contains("ALU")) {
                    // logado
                    /*
                       aluno                  
                    */
                    FrameAluno fmAluno = new FrameAluno();
                    fmAluno.setVisible(true);
                    return true;
                } else if(p.getLogin().equals(usuario)  && p.getSenha().equals(senha) && p.getLogin().contains("ADM")) {
                    // logado
                    /*
                       administrador 
                    */
                    FrameAdm fmAdm = new FrameAdm();
                    fmAdm.setVisible(true);
                    return true;
                }else if(p.getLogin().equals(usuario)  && p.getSenha().equals(senha) && p.getLogin().contains("PRF")) {
                    // logado
                    /*
                       professor 
                    */
                    FrameProfessor fmProf = new FrameProfessor();
                    fmProf.setVisible(true);
                    return true;
                }
            }
            if(((l == false) && (s == false)) ||((l == true) && (s == false))||((l == false) && (s == true)) )    
            {
                System.out.println("usuário ou senha inválido");
            }
            return false;
}
}
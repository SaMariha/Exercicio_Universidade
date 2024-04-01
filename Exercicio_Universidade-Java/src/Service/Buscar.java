package Service;

import Entities.Alunos;

import java.util.List;
import java.util.Objects;

public class Buscar {

    public static Alunos buscar(List<Alunos> alunos, int ID) {
        Alunos aluno = alunos.stream().filter(x ->x.getID()==ID).findFirst().orElse(null);
        if(aluno!=null) {
            System.out.println("Matrícula: " + aluno.getID() + "\nNome: " + aluno.getName() + "\nCurso: " + aluno.getCurso() + "\n\n");
            return aluno;
        }

            System.out.println("Não há essa matrícula no banco de dados");
            return null;
        /*for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getID() == ID) {
                System.out.println("Matrícula: " + alunos.get(i).getID() + "\nNome: " + alunos.get(i).getName() + "\nCurso: " + alunos.get(i).getCurso() + "\n\n");
                return i;
            }
        }
        System.out.println("Não existem registros com essse número de matrícula");
        return null;*/



    }
}
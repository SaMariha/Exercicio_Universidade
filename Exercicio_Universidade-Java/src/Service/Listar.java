package Service;

import Entities.Alunos;

import java.util.ArrayList;
import java.util.List;

public class Listar {
    public static void listar(List<Alunos> lista){

        for (Alunos aluno : lista) {
            System.out.println("Matrícula: "+aluno.getID()+"\nNome: "+aluno.getName()+"\nCurso: "+aluno.getCurso()+"\n\n");
        }

    }
}

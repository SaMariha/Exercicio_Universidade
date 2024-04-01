package Service;

import Entities.Alunos;

import java.util.List;
import java.util.Scanner;

import static Service.Buscar.buscar;

public class Excluir {
    public static void excluir(List<Alunos> alunos, int matricula){
        int opcao;
        Scanner sc = new Scanner(System.in);

        Alunos aluno= buscar(alunos,matricula);
        if(aluno!=null) {
          alunos.remove(aluno);
        System.out.println("Aluno excluído com sucesso!");
        }
    }
}

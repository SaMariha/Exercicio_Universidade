package Service;

import Entities.Alunos;

import java.util.List;
import java.util.Scanner;

import static Service.Buscar.buscar;

public class Alterar {

    public static void alterar(List<Alunos> alunos, int matricula){
        int opcao;
        Scanner sc = new Scanner(System.in);

        Alunos aluno= buscar(alunos,matricula);
        if(aluno!=null) {
            System.out.println("Digite o que deseja alterar:\n1-Nome: \n2-Curso: ");
            opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    sc.nextLine();
                    System.out.println("Digite o novo nome:");
                    aluno.setName(sc.nextLine());
                    System.out.println("Nome alterado com sucesso!");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Digite o novo curso:");
                    aluno.setCurso(sc.nextLine());
                    System.out.println("Curso alterado com sucesso!");
                    break;
            }
        }
    }
}

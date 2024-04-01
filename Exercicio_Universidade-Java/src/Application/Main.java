package Application;

import Entities.Alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Service.Alterar.alterar;
import static Service.Cadastrar.cadastro;
import static Service.Excluir.excluir;
import static Service.Listar.listar;
import static Service.Buscar.buscar;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alunos> alunos = new ArrayList<>();
        int service;
        boolean continuar = true;
        int matricula;
        System.out.println("SISTEMA DE ALUNOS - UNIVERSIDADE");

        do {
            System.out.println("Digite a opcao que voce deseja: \n1: Registrar novos alunos.\n2: Buscar aluno pelo nome ou matricula.\n3: Excluir algum aluno pelo nome ou matricula.\n4: Listar todos os alunos.\n5: Editar dados do aluno pelo nome ou matricula.\n6: Sair.\n");
            service = sc.nextInt();
            switch (service) {
                case 1:
                    cadastro(alunos);
                    listar(alunos);
                    break;
                case 2:
                    System.out.println("Digite a matrícula do aluno: ");
                    matricula=sc.nextInt();
                    buscar(alunos,matricula);
                    break;
                case 3:
                    System.out.println("Digite a matrícula do aluno: ");
                    matricula=sc.nextInt();
                    excluir(alunos,matricula);
                    listar(alunos);
                    break;
                case 4:
                     listar(alunos);
                    break;
                case 5:
                    System.out.println("Digite a matrícula do aluno: ");
                    matricula=sc.nextInt();
                    alterar(alunos,matricula);
                    break;
                case 6:
                    System.out.println("Encerrando o programa...");
                    continuar=false;
                break;
            }
        } while (continuar);
    }
}
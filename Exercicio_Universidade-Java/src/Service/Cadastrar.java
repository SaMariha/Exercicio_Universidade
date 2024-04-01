package Service;

import Entities.Alunos;

import java.util.List;
import java.util.Scanner;

public class Cadastrar {

    public static List<Alunos> cadastro(List<Alunos> lista) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome=sc.nextLine();
        System.out.println("Digite a matricula: ");
        int matricula=sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o curso: ");
        String curso=sc.nextLine();
        lista.add(new Alunos(nome,matricula,curso));
        System.out.println("Aluno cadastrado com sucesso!");
            return lista;
    }


}

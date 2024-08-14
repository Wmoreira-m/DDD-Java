import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String resposta;
        double media = 0;

        do {
            // Solicita o nome do aluno
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do aluno: ");
            int idade = Integer.parseInt(scanner.nextLine());
            System.out.print("Digite a RM do aluno:");
            String rm = scanner.nextLine();
            System.out.print("Digite a Nota 1 do aluno:");
            double nota1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Digite a Nota 2 do aluno:");
            double nota2 = Double.parseDouble(scanner.nextLine());


            // Cria um novo objeto Aluno e adiciona à lista
            Aluno aluno = new Aluno(nome,idade, rm, nota1, nota2);
            alunos.add(aluno);

            // Pergunta se o usuário deseja adicionar mais alunos
            System.out.print("Deseja adicionar mais alunos? (sim/não): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Quantidade de alunos" + alunos.size());

        // Exibe a lista de alunos
        System.out.println("\nLista de alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            media += aluno.media();
        }
    }


    }

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para usar ponto ao invés de vírgula nos decimais
        Scanner sc = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<>();
        int opcao = 0;

        System.out.println("=== Bem-vindo ao Sistema de Notas Escolar ===");

        while (opcao != 3) {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar novo aluno");
            System.out.println("2 - Listar alunos cadastrados");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    
                    System.out.print("Digite a primeira nota: ");
                    double nota1 = sc.nextDouble();
                    
                    System.out.print("Digite a segunda nota: ");
                    double nota2 = sc.nextDouble();

                    // Instancia o objeto e guarda na lista
                    Aluno novoAluno = new Aluno(nome, nota1, nota2);
                    listaAlunos.add(novoAluno);
                    
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Alunos ---");
                    if (listaAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado ainda.");
                    } else {
                        // Percorre a lista e usa o toString() que criamos
                        for (Aluno aluno : listaAlunos) {
                            System.out.println(aluno.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}
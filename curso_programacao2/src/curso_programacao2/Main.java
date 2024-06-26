package curso_programacao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Empregado> empregados = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Adicionar Empregado");
            System.out.println("2. Exibir Informações do Empregado");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    adicionarEmpregado(scanner);
                    break;
                case 2:
                    exibirInformacoesEmpregado(scanner);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void adicionarEmpregado(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Alergias: ");
        String alergias = scanner.nextLine();
        System.out.print("Problemas Médicos: ");
        String problemasMedicos = scanner.nextLine();
        System.out.print("Telefone de Contato: ");
        String telefoneContato = scanner.nextLine();
        System.out.print("Email de Contato: ");
        String emailContato = scanner.nextLine();

        Empregado empregado = new Empregado(nome, id, alergias, problemasMedicos, telefoneContato, emailContato);
        empregados.add(empregado);

        System.out.println("Empregado adicionado com sucesso!");
    }

    private static void exibirInformacoesEmpregado(Scanner scanner) {
        System.out.print("Digite o ID do empregado: ");
        String id = scanner.nextLine();

        for (Empregado empregado : empregados) {
            if (empregado.getId().equals(id)) {
                empregado.exibirInformacoes();
                return;
            }
        }

        System.out.println("Empregado não encontrado.");
    }
}
package lista09.questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opc;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Adicionar Gerente");
            System.out.println("3. Obter salário de um Funcionário");
            System.out.println("4. Obter salário de um Gerente");
            System.out.println("0. Sair");
            System.out.print("Opção desejada:");

            opc = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (opc == 1) {
                System.out.print("Nome: ");
                String nomeFuncionario = scanner.nextLine();
                System.out.print("CPF: ");
                String cpfFuncionario = scanner.nextLine();
                System.out.print("Data de nascimento: ");
                String dataNascimentoFuncionario = scanner.nextLine();
                System.out.print("Salário: ");
                double salarioFuncionario = scanner.nextDouble();
                scanner.nextLine();

                Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, dataNascimentoFuncionario, salarioFuncionario);
                funcionarios.add(funcionario);
                System.out.println("Funcionário adicionado com sucesso.");
            }

            if (opc == 2) {
                System.out.print("Nome: ");
                String nomeGerente = scanner.nextLine();
                System.out.print("CPF: ");
                String cpfGerente = scanner.nextLine();
                System.out.print("Data de nascimento: ");
                String dataNascimentoGerente = scanner.nextLine();
                System.out.print("Salário: ");
                double salarioGerente = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Departamento: ");
                String departamento = scanner.nextLine();

                Gerente gerente = new Gerente(nomeGerente, cpfGerente, dataNascimentoGerente, salarioGerente, departamento);
                funcionarios.add(gerente);
                System.out.println("Gerente adicionado com sucesso.");
            }


            if (opc == 3) {
                System.out.print("Informe o CPF do Funcionário: ");
                String cpfFuncionarioBusca = scanner.nextLine();

                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getCpf().equals(cpfFuncionarioBusca) && !(funcionario instanceof Gerente)) {
                        System.out.println("Funcionário encontrado: " + funcionario.getNome());
                        System.out.println("Salário: R$ " + funcionario.getSalario());
                        break;
                    }
                }
            }

            if (opc == 4) {
                System.out.print("Informe o CPF do Gerente: ");
                String cpfGerenteBusca = scanner.nextLine();

                for (Funcionario func : funcionarios) {
                    if (func.getCpf().equals(cpfGerenteBusca) && func instanceof Gerente) {
                        Gerente gerente = (Gerente) func;
                        System.out.println("Gerente encontrado: " + gerente.getNome());
                        System.out.println("Salário (com gratificação): R$ " + gerente.getSalario());
                        System.out.println("Departamento: " + gerente.getDepartamento());
                        break;
                    }
                }


            }

        } while (opc != 0);

        scanner.close();
    }
}

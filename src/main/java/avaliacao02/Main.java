package avaliacao02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Trabalhador> trabalhadores = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = 0;
        do {
            try {
                System.out.println("\n1 - Cadastrar Trabalhador Integral");
                System.out.println("2 - Cadastrar Trabalhador Horista");
                System.out.println("3 - Obter salário de um trabalhador");
                System.out.println("4 - Calcular salário de um trabalhador");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opc = Integer.parseInt(scanner.nextLine());

                if (opc == 1 || opc == 2) {
                    System.out.print("Matrícula: ");
                    int matricula = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(scanner.nextLine());
                    System.out.print("Salário Base: ");
                    double salarioBase = Double.parseDouble(scanner.nextLine());

                    // Essa verificação também poderia ocorrer dentro do construtor da classe Trabalhador
                    if (idade <= 0) {
                        throw new ValorInvalidoException("A idade deve ser maior que zero!");
                    }

                    // Essa verificação também poderia ocorrer dentro do construtor da classe Trabalhador
                    if (salarioBase <= 0) {
                        throw new ValorInvalidoException("O salario base deve ser maior que zero!");
                    }

                    if (opc == 1) {
                        Trabalhador t = new TrabalhadorIntegral(matricula, nome, idade, salarioBase);
                        salvarTrabalhador(t);
                        System.out.println("Trabalhador Integral cadastrado com sucesso!");
                    } else {
                        System.out.print("Total de Horas Trabalhadas: ");
                        int totalHoras = Integer.parseInt(scanner.nextLine());

                        // Essa verificação também poderia ocorrer dentro do construtor da classe TrabalhadorHorista
                        if (totalHoras <= 0) {
                            throw new ValorInvalidoException("O total de horas deve ser maior que zero!");
                        }

                        Trabalhador t = new TrabalhadorHorista(matricula, nome, idade, salarioBase, totalHoras);

                        salvarTrabalhador(t);
                        System.out.println("Trabalhador Horista cadastrado com sucesso!");
                    }
                }

                if (opc == 3) {
                    System.out.print("Matrícula: ");
                    int matricula = Integer.parseInt(scanner.nextLine());

                    for (Trabalhador t : trabalhadores) {
                        if (t.getMatricula() == matricula) {
                            System.out.println("Salário Base: " + t.getSalarioBase());
                            break;
                        }
                    }
                }

                if (opc == 4) {
                    System.out.print("Matrícula: ");
                    int matricula = Integer.parseInt(scanner.nextLine());

                    for (Trabalhador t : trabalhadores) {
                        if (t.getMatricula() == matricula) {
                            System.out.println("Salário: " + t.calcularSalario());
                            break;
                        }
                    }
                }

                if (opc == 0) {
                    System.out.println("Saindo...");
                }

            } catch (ValorInvalidoException | TrabalhadorJaCadastradoException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            } catch (Exception e) {
                System.out.println("Aconteceu um errro inesperado: " + e.getMessage());
            }
        } while (opc != 0);
    }

    public static void salvarTrabalhador(Trabalhador trabalhador) {
        for (Trabalhador t : trabalhadores) {
            if (t.getMatricula() == trabalhador.getMatricula()) {
                throw new TrabalhadorJaCadastradoException("O trabalhador informado já foi cadastrado!");
            }
        }

        trabalhadores.add(trabalhador);
    }
}

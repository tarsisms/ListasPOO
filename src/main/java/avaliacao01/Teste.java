package avaliacao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Veiculo> listaVeiculos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Automóvel");
            System.out.println("2. Cadastrar Caminhonete");
            System.out.println("3. Cadastrar Elétrico");
            System.out.println("4. Alugar um Veículo");
            System.out.println("5. Devolver um Veículo");
            System.out.println("6. Listar veículos alugados");
            System.out.println("7. Listar veículos disponiveis");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    cadastrarVeiculo(1);
                    break;
                case 2:
                    cadastrarVeiculo(2);
                    break;
                case 3:
                    cadastrarVeiculo(3);
                    break;
                case 4:
                    alugarVeiculo();
                    break;
                case 5:
                    devolverVeiculo();
                    break;
                case 6:
                    listarVeiculos(true);
                    break;
                case 7:
                    listarVeiculos(false);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarVeiculo(int tipo) {
        System.out.print("Digite a placa: ");
        String placa = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o valor da diária: ");
        double precoDiaria = scanner.nextDouble();
        scanner.nextLine();

        Veiculo veiculo = null;
        switch (tipo) {
            case 1:
                veiculo = new Automovel(placa, modelo, marca, precoDiaria);
                break;
            case 2:
                veiculo = new Caminhonete(placa, modelo, marca, precoDiaria);
                break;
            case 3:
                veiculo = new Eletrico(placa, modelo, marca, precoDiaria);
                break;
        }

        if (veiculo != null) {
            listaVeiculos.add(veiculo);
        }

        System.out.println("Veiculo cadastrado com sucesso.");
    }

    private static void alugarVeiculo() {
        System.out.print("Digite a placa do veículo para alugar: ");
        String placa = scanner.nextLine();

        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                if (veiculo.getStatus()) {
                    System.out.println("O veículo " + placa + " já está alugado.");
                } else {
                    veiculo.setStatus(true);
                    System.out.print("Veiculo alugado com sucesso.");
                }
                return;
            }
        }

        System.out.println("O veiculo informado não foi encontrado.");
    }

    private static void devolverVeiculo() {
        System.out.print("Digite a placa do veículo para devolver: ");
        String placa = scanner.nextLine();


        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                if (!veiculo.getStatus()) {
                    System.out.println("O veículo " + placa + " não está alugado.");
                } else {
                    System.out.print("Digite o número de diárias: ");
                    int diarias = scanner.nextInt();
                    scanner.nextLine();

                    double valorAluguel = veiculo.calcularValorAluguel(diarias);
                    double valorFinal = veiculo.calcularValorFinalAluguel(diarias);
                    System.out.println("Valor final a ser pago (s/ imposto): R$ " + valorAluguel);
                    System.out.println("Valor final a ser pago (c/ imposto): R$ " + valorFinal);

                    veiculo.setStatus(false);
                    System.out.print("Veiculo devolvido com sucesso.");
                }

                return;
            }
        }

        System.out.println("O veiculo informado não foi encontrado.");
    }

    private static void listarVeiculos(boolean alugados) {
        String status = alugados ? "alugados" : "disponiveis";
        if (listaVeiculos.isEmpty()) {
            System.out.println("Não há veiculos " + status);
            return;
        }

        System.out.println("Veículos " + status + ": ");

        for (Veiculo veiculo : listaVeiculos) {
            if (veiculo.getStatus() == alugados) {
                System.out.println("Placa: " + veiculo.getPlaca()
                        + " | Modelo: " + veiculo.getModelo()
                        + " | Marca: " + veiculo.getMarca());
            }
        }
    }
}

package lista10.questao01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Seguro> seguros = new ArrayList<>();

        int opc;

        do {
            System.out.println("========================================================================");
            System.out.println("\n1. Cadastrar um novo seguro");
            System.out.println("2. Listar todos os seguros cadastrados");
            System.out.println("3. Calcular o premio de um seguro individual");
            System.out.println("4. Exibir o valor total dos premios de todos os seguros cadastrados");
            System.out.println("0. Sair do sistema");
            System.out.println("========================================================================");
            System.out.print("Digite a opc: ");
            opc = scanner.nextInt();

            if (opc == 1) {
                System.out.print("Digite o tipo (1-Residencial, 2-Automotivo, 3-Vida): ");
                int tipo = scanner.nextInt();

                System.out.print("Digite o codigo: ");
                int codigo = scanner.nextInt();

                System.out.print("Digite o nome do segurado: ");
                String nome = scanner.next();

                System.out.print("Digite o valor segurado: ");
                double valorSegurado = scanner.nextDouble();

                System.out.print("Digite o valor base do seguro: ");
                double valorBase = scanner.nextDouble();

                if (tipo == 1) {
                    SeguroResidencial residencial = new SeguroResidencial(codigo, nome, valorSegurado, valorBase);
                    seguros.add(residencial);
                } else if (tipo == 2) {
                    SeguroAutomotivo automotivo = new SeguroAutomotivo(codigo, nome, valorSegurado, valorBase);
                    seguros.add(automotivo);
                } else if (tipo == 3) {
                    System.out.print("Digite a idade do segurado: ");
                    int idade = scanner.nextInt();

                    SeguroVida vida = new SeguroVida(codigo, nome, valorSegurado, valorBase, idade);
                    seguros.add(vida);
                }
            }

            if (opc == 2) {
                for (int i = 0; i < seguros.size(); i++) {
                    Seguro seguro = seguros.get(i);
                    System.out.println("Código: " + seguro.getCodigo() + "\n"
                            + "Segurado: " + seguro.getNomeSegurado() + "\n"
                            + "Tipo: " + seguro.getClass().getSimpleName() + "\n"
                            + "Valor Segurado: " + seguro.getValorSegurado() + " | Premio: " + seguro.calcularPremio() + "\n"
                    );
                }
            }

            if (opc == 3) {
                System.out.print("Digite o nome do segurado: ");
                String nome = scanner.next();

                for (int i = 0; i < seguros.size(); i++) {
                    Seguro seguro = seguros.get(i);

                    if (nome.equals(seguro.getNomeSegurado())) {
                        System.out.println("O premio do seguro de " + seguro.getNomeSegurado() + " é " + seguro.calcularPremio());
                    }
                }
            }

            if (opc == 4) {
                double total = 0;
                for (int i = 0; i < seguros.size(); i++) {
                    Seguro seguro = seguros.get(i);
                    total += seguro.calcularPremio();
                }

                System.out.println("O valor total dos premios é " + total);
            }

        } while (opc != 0);
    }

}

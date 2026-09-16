package lista10.questao02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PlanoAcademia> planos = new ArrayList<>();

        int opc;

        do {
            System.out.println("========================================================================");
            System.out.println("\n1. Cadastrar um novo plano (basico, premium, VIP)");
            System.out.println("2. Listar todos os planos cadastrados");
            System.out.println("3. Calcular a mensalidade de um cliente individual");
            System.out.println("4. Exibir a arrecadacao mensal total da academia");
            System.out.println("5. Simular o valor da mensalidade entre os diferentes tipos de plano");
            System.out.println("0. Sair do sistema");
            System.out.println("========================================================================");
            System.out.print("Digite a opc: ");
            opc = scanner.nextInt();

            if (opc == 1) {
                System.out.print("Digite o tipo (1-Basico, 2-Premium, 3-VIP): ");
                int tipo = scanner.nextInt();

                System.out.print("Digite o codigo: ");
                int codigo = scanner.nextInt();

                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.next();

                System.out.print("Digite a idade do cliente: ");
                int idade = scanner.nextInt();

                System.out.print("Digite o periodo do contrato (em meses): ");
                int periodo = scanner.nextInt();

                if (tipo == 1) {
                    PlanoBasico basico = new PlanoBasico(codigo, nome, idade, periodo);
                    planos.add(basico);
                } else if (tipo == 2) {
                    PlanoPremium premium = new PlanoPremium(codigo, nome, idade, periodo);
                    planos.add(premium);
                } else if (tipo == 3) {
                    PlanoVIP vip = new PlanoVIP(codigo, nome, idade, periodo);
                    planos.add(vip);
                }
            }

            if (opc == 2) {
                for (int i = 0; i < planos.size(); i++) {
                    PlanoAcademia plano = planos.get(i);
                    System.out.println("Código: " + plano.getCodigo() + "\n"
                            + "Cliente: " + plano.getNomeCliente() + "\n"
                            + "Idade: " + plano.getIdade() + "\n"
                            + "Tipo: " + plano.getClass().getSimpleName() + "\n"
                            + "Valor Base: " + plano.getValorBase() + " | Periodo: " + plano.getPeriodoContratoMeses() + " meses" + "\n"
                            + "Mensalidade: " + plano.calcularMensalidade() + "\n"
                    );
                }
            }

            if (opc == 3) {
                System.out.print("Digite o nome do cliente: ");
                String nome = scanner.next();

                for (int i = 0; i < planos.size(); i++) {
                    PlanoAcademia plano = planos.get(i);

                    if (nome.equalsIgnoreCase(plano.getNomeCliente())) {
                        System.out.println("A mensalidade de " + plano.getNomeCliente() + " é " + plano.calcularMensalidade());
                    }
                }
            }

            if (opc == 4) {
                double total = 0;
                for (int i = 0; i < planos.size(); i++) {
                    PlanoAcademia plano = planos.get(i);
                    total += plano.calcularMensalidade();
                }

                System.out.println("A arrecadacao mensal total é " + total);
            }

            if (opc == 5) {
                System.out.print("Digite a idade do cliente: ");
                int idade = scanner.nextInt();

                System.out.print("Digite o periodo do contrato (em meses): ");
                int periodo = scanner.nextInt();

                PlanoAcademia basico = new PlanoBasico(0, "Simulacao", idade, periodo);
                PlanoAcademia premium = new PlanoPremium(0, "Simulacao", idade, periodo);
                PlanoAcademia vip = new PlanoVIP(0, "Simulacao", idade, periodo);

                System.out.println("Plano Basico: " + basico.calcularMensalidade());
                System.out.println("Plano Premium: " + premium.calcularMensalidade());
                System.out.println("Plano VIP: " + vip.calcularMensalidade());
            }

        } while (opc != 0);
    }

}

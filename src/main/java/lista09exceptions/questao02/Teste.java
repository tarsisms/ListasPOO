package lista09exceptions.questao02;

import lista09exceptions.questao02.domain.Conta;

import lista09exceptions.questao02.domain.ContaCorrente;
import lista09exceptions.questao02.domain.ContaPoupanca;
import lista09exceptions.questao02.exceptions.ContaJaExisteExcepction;
import lista09exceptions.questao02.exceptions.SaldoInsuficienteException;
import lista09exceptions.questao02.exceptions.ValorNegativoException;

import java.util.ArrayList;
import java.util.Scanner;


public class Teste {
    private static final Scanner scanner = new Scanner(System.in);
    private static ArrayList<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        int opc;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Conta corrente");
            System.out.println("2. Cadastrar Poupança");
            System.out.println("3. Verificar saldo de uma Conta");
            System.out.println("4. Efetuar deposito em uma Conta");
            System.out.println("5. Efetuar saque em uma Conta");
            System.out.println("6. Executar a rotina de atualização em todas as contas");
            System.out.println("0. Sair");

            System.out.print("Opção desejada:");
            opc = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            try {
                if (opc == 1) {
                    System.out.print("Número da Conta Corrente: ");
                    String numeroConta = scanner.nextLine();

                    // Checar se a conta já existe
                    checarNumConta(numeroConta);

                    System.out.print("CPF do Cliente: ");
                    String cpfCliente = scanner.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    System.out.print("Taxa de manutenção: ");
                    double taxa = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nome do Banco: ");
                    String banco = scanner.nextLine();

                    Conta contaCorrente = new ContaCorrente(numeroConta, cpfCliente, saldo, taxa, banco);
                    contas.add(contaCorrente);
                    System.out.println("Conta Corrente cadastrada com sucesso.");
                }

                if (opc == 2) {
                    System.out.print("Número da Conta Poupança: ");
                    String numeroConta = scanner.nextLine();

                    // Checar se a conta já existe
                    checarNumConta(numeroConta);

                    System.out.print("CPF do Cliente: ");
                    String cpfCliente = scanner.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = scanner.nextDouble();
                    System.out.print("Taxa de juros: ");
                    double taxa = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nome do Banco: ");
                    String banco = scanner.nextLine();

                    Conta contaPoupanca = new ContaPoupanca(numeroConta, cpfCliente, saldo, taxa, banco);
                    contas.add(contaPoupanca);
                    System.out.println("Conta Poupança cadastrada com sucesso.");
                }

                if (opc == 3) {
                    System.out.print("Informe o número da conta: ");
                    String numeroConta = scanner.nextLine();
                    boolean encontrado = false;
                    for (Conta conta : contas) {
                        if (conta.getNumeroConta().equals(numeroConta)) {
                            System.out.println("Saldo da conta: R$ " + conta.getSaldo());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Conta não encontrada.");
                    }

                }

                if (opc == 4) {
                    System.out.print("Informe o número da conta para saque: ");
                    String numeroConta = scanner.nextLine();
                    System.out.print("Informe o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();

                    for (Conta conta : contas) {
                        if (conta.getNumeroConta().equals(numeroConta)) {
                            conta.saque(valorSaque);
                            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + conta.getSaldo());
                            break;
                        }
                    }
                }


                if (opc == 5) {
                    System.out.print("Informe o número da conta para deposito: ");
                    String numeroConta = scanner.nextLine();
                    System.out.print("Informe o valor do deposito: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    for (Conta conta : contas) {
                        if (conta.getNumeroConta().equals(numeroConta)) {
                            conta.deposito(valor);
                            System.out.println("Deposito realizado com sucesso. Novo saldo: R$ " + conta.getSaldo());
                            break;
                        }
                    }
                }

                if (opc == 6) {
                    for (Conta conta : contas) {
                        conta.atualizar();
                        System.out.println("Conta " + conta.getNumeroConta() + " atualizada. Novo saldo: R$ " + conta.getSaldo());
                    }
                }

            } catch (ContaJaExisteExcepction e) {
                System.out.println("ContaJaExisteExcepction: " + e.getMessage());
            } catch (SaldoInsuficienteException e) {
                System.out.println("SaldoInsuficienteException: " + e.getMessage());
            } catch (ValorNegativoException e) {
                System.out.println("ErValorNegativoExceptionro: " + e.getMessage());
            }

        } while (opc != 0);
    }

    private static void checarNumConta(String numConta) {
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numConta)) {
                throw new ContaJaExisteExcepction("Já Existe uma conta com o numero informado!");
            }
        }
    }
}

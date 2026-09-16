package lista10.questao03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Curso> cursos = new ArrayList<>();

        int opc;

        do {
            System.out.println("========================================================================");
            System.out.println("\n1. Cadastrar um novo curso");
            System.out.println("2. Listar todos os cursos cadastrados");
            System.out.println("3. Calcular a mensalidade de um curso individual");
            System.out.println("4. Calcular o faturamento total de um curso individual");
            System.out.println("5. Exibir os cursos com o maior e o menor faturamento");
            System.out.println("6. Exibir o faturamento total somando todos os cursos");
            System.out.println("0. Sair do sistema");
            System.out.print("Digite a opc: ");
            System.out.println("========================================================================");
            opc = scanner.nextInt();

            if (opc == 1) {
                System.out.print("Digite o tipo (1-Presencial, 2-EAD, 3-Hibrido, 4-Padrao): ");
                int tipo = scanner.nextInt();

                System.out.print("Digite o codigo: ");
                int codigo = scanner.nextInt();

                System.out.print("Digite o nome do curso: ");
                String nome = scanner.next();

                System.out.print("Digite a carga horaria: ");
                int cargaHoraria = scanner.nextInt();

                System.out.print("Digite o valor base da mensalidade: ");
                double valorBase = scanner.nextDouble();

                System.out.print("Digite o numero de estudantes matriculados: ");
                int numeroEstudantes = scanner.nextInt();

                if (tipo == 1) {
                    System.out.print("Digite o valor por hora (infraestrutura): ");
                    double valorPorHora = scanner.nextDouble();

                    CursoPresencial presencial = new CursoPresencial(codigo, nome, cargaHoraria, valorBase, numeroEstudantes, valorPorHora);
                    cursos.add(presencial);
                } else if (tipo == 2) {
                    CursoEAD ead = new CursoEAD(codigo, nome, cargaHoraria, valorBase, numeroEstudantes);
                    cursos.add(ead);
                } else if (tipo == 3) {
                    System.out.print("Digite o valor por hora (infraestrutura): ");
                    double valorPorHora = scanner.nextDouble();

                    CursoHibrido hibrido = new CursoHibrido(codigo, nome, cargaHoraria, valorBase, numeroEstudantes, valorPorHora);
                    cursos.add(hibrido);
                } else if (tipo == 4) {
                    Curso padrao = new Curso(codigo, nome, cargaHoraria, valorBase, numeroEstudantes);
                    cursos.add(padrao);
                }
            }

            if (opc == 2) {
                for (int i = 0; i < cursos.size(); i++) {
                    Curso curso = cursos.get(i);
                    System.out.println("Código: " + curso.getCodigo() + "\n"
                            + "Curso: " + curso.getNomeCurso() + "\n"
                            + "Tipo: " + curso.getClass().getSimpleName() + "\n"
                            + "Carga Horaria: " + curso.getCargaHoraria() + "h | Nº Estudantes: " + curso.getNumeroEstudantes() + "\n"
                            + "Mensalidade: " + curso.calcularMensalidade() + "\n"
                    );
                }
            }

            if (opc == 3) {
                System.out.print("Digite o codigo do curso: ");
                int codigo = scanner.nextInt();

                for (int i = 0; i < cursos.size(); i++) {
                    Curso curso = cursos.get(i);

                    if (codigo == curso.getCodigo()) {
                        System.out.println("A mensalidade de " + curso.getNomeCurso() + " é " + curso.calcularMensalidade());
                    }
                }
            }

            if (opc == 4) {
                System.out.print("Digite o codigo do curso: ");
                int codigo = scanner.nextInt();

                for (int i = 0; i < cursos.size(); i++) {
                    Curso curso = cursos.get(i);

                    if (codigo == curso.getCodigo()) {
                        System.out.println("O faturamento total de " + curso.getNomeCurso() + " é " + curso.calcularFaturamentoTotal());
                    }
                }
            }

            if (opc == 5) {
                if (!cursos.isEmpty()) {
                    Curso maiorFaturamento = cursos.getFirst();
                    Curso menorFaturamento = cursos.getFirst();

                    for (int i = 0; i < cursos.size(); i++) {
                        Curso cursoAtual = cursos.get(i);

                        if (cursoAtual.calcularFaturamentoTotal() > maiorFaturamento.calcularFaturamentoTotal()) {
                            maiorFaturamento = cursoAtual;
                        }

                        if (cursoAtual.calcularFaturamentoTotal() < menorFaturamento.calcularFaturamentoTotal()) {
                            menorFaturamento = cursoAtual;
                        }
                    }

                    System.out.println("O maior faturamento é do curso " + maiorFaturamento.getNomeCurso()
                            + " com faturamento de " + maiorFaturamento.calcularFaturamentoTotal());
                    System.out.println("O menor faturamento é do curso " + menorFaturamento.getNomeCurso()
                            + " com faturamento de " + menorFaturamento.calcularFaturamentoTotal());
                }
            }

            if (opc == 6) {
                double total = 0;
                for (int i = 0; i < cursos.size(); i++) {
                    Curso curso = cursos.get(i);
                    total += curso.calcularFaturamentoTotal();
                }

                System.out.println("O faturamento total é " + total);
            }

        } while (opc != 0);
    }

}

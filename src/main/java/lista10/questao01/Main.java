package lista10.questao01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        int opc = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a opcao desejada: " +
                    "\n1- Cadastrar um livro" +
                    "\n2- Listar Livros Digitais" +
                    "\n3- Listar Livros Fisicos" +
                    "\n4- Efetuar a venda de um livro" +
                    "\nOpc: ");
            opc = scanner.nextInt();

            if (opc == 1) {
                System.out.print("\nVoce deseja cadastrar: " +
                        "\n1- Livro Fisico" +
                        "\n2- Livro Digital" +
                        "\nOpc: ");
                int subOpc = scanner.nextInt();

                if (subOpc == 1) {
                    System.out.println("\n=== Cadastro do Livro Fisico ===");
                    System.out.print("Digite o codigo: ");
                    int codigo = scanner.nextInt();

                    System.out.print("Digite o titulo: ");
                    String titulo = scanner.next();

                    System.out.print("Digite a editora: ");
                    String editora = scanner.next();

                    System.out.print("Digite o autor: ");
                    String autor = scanner.next();

                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();

                    System.out.print("Digite a preco unitario: ");
                    double precoUnitario = scanner.nextDouble();

                    System.out.print("Digite o peso em Kg: ");
                    double peso = scanner.nextDouble();

                    System.out.print("Digite o valor do frete por Kg: ");
                    double freteKg = scanner.nextDouble();

                    LivroFisico livroFisico = new LivroFisico(codigo, titulo, editora, autor, quantidade, precoUnitario, peso, freteKg);
                    livros.add(livroFisico);
                }
                if (subOpc == 2) {
                    System.out.println("\n=== Cadastro do Livro Digital ===");
                    System.out.print("Digite o codigo: ");
                    int codigo = scanner.nextInt();

                    System.out.print("Digite o titulo: ");
                    String titulo = scanner.next();

                    System.out.print("Digite a editora: ");
                    String editora = scanner.next();

                    System.out.print("Digite o autor: ");
                    String autor = scanner.next();

                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();

                    System.out.print("Digite a preco unitario: ");
                    double precoUnitario = scanner.nextDouble();

                    LivroDigital livroDigital = new LivroDigital(codigo, titulo, editora, autor, quantidade, precoUnitario);
                    livros.add(livroDigital);
                }
                System.out.println();
            }

            if (opc == 2) {
                System.out.println("\nOs livros digitais disponiveis são: ");
                for (Livro l : livros) {
                    if (l instanceof LivroDigital && l.getQuantidade() > 0) {
                        System.out.println("====================================");
                        System.out.println("Titulo: " + l.getTitulo());
                        System.out.println("Autor: " + l.getAutor());
                        System.out.println("Quantidade: " + l.getQuantidade());
                        System.out.println("====================================\n");
                    }
                }
                System.out.println();
            }

            if (opc == 3) {
                System.out.println("\nOs livros fisicos disponiveis são: ");
                for (Livro l : livros) {
                    if (l instanceof LivroFisico && l.getQuantidade() > 0) {
                        System.out.println("====================================");
                        System.out.println("Titulo: " + l.getTitulo());
                        System.out.println("Autor: " + l.getAutor());
                        System.out.println("Quantidade: " + l.getQuantidade());
                        System.out.println("====================================\n");
                    }
                }
                System.out.println();
            }

            if (opc == 4) {
                System.out.print("Digite o codigo do livro: ");
                int codigo = scanner.nextInt();

                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();

                for (Livro l : livros) {
                    if (l.getCodigo() == codigo && l.getQuantidade() >= quantidade) {
                        int novaQuantidade = l.getQuantidade() - quantidade;

                        System.out.println("\n====================================");
                        System.out.println("    Venda efetuada com sucesso!");
                        System.out.println("====================================");
                        System.out.println("Titulo: " + l.getTitulo());
                        System.out.println("Autor: " + l.getAutor());
                        System.out.println("Quantidade: " + quantidade);
                        System.out.println("Preço Unitario: " + l.getPrecoUnitario());
                        System.out.println("Preço Final: " + l.calcularPrecoFinal(quantidade));
                        System.out.println("====================================");

                        l.setQuantidade(novaQuantidade);
                        System.out.println("Nova quantidade em estoque: " + l.getQuantidade());
                    }
                }
                System.out.println();
            }

        } while (opc != 0);

    }

}

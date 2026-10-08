package lista11.questao05;

public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private double tamanho;


    public Animal(String nome, int idade, double peso, double tamanho) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.tamanho = tamanho;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}


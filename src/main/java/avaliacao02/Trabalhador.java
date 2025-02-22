package avaliacao02;

public abstract class Trabalhador {
    private int matricula;
    private String nome;
    private int idade;
    private double salarioBase;

    public Trabalhador(int matricula, String nome, int idade, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = salarioBase;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}


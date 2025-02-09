package lista09.questao01;

class Gerente extends Funcionario {
    private String departamento;
    private double gratificacao;

    public Gerente(String nome, String cpf, String dataNascimento, double salario, String departamento) {
        super(nome, cpf, dataNascimento, salario);
        this.departamento = departamento;
        this.gratificacao = 1500;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + gratificacao;
    }
}
package lista10.questao02;

public class PlanoAcademia {

    private int codigo;
    private String nomeCliente;
    private int idade;
    private double valorBase;
    private int periodoContratoMeses;

    public PlanoAcademia(int codigo, String nomeCliente, int idade, double valorBase, int periodoContratoMeses) {
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.idade = idade;
        this.valorBase = valorBase;
        this.periodoContratoMeses = periodoContratoMeses;
    }

    public double calcularMensalidade() {
        return valorBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getIdade() {
        return idade;
    }

    public double getValorBase() {
        return valorBase;
    }

    public int getPeriodoContratoMeses() {
        return periodoContratoMeses;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public void setPeriodoContratoMeses(int periodoContratoMeses) {
        this.periodoContratoMeses = periodoContratoMeses;
    }
}

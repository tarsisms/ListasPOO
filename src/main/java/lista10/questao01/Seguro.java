package lista10.questao01;

public class Seguro {

    private int codigo;
    private String nomeSegurado;
    private double valorSegurado;
    private double valorBase;

    public Seguro(int codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        this.codigo = codigo;
        this.nomeSegurado = nomeSegurado;
        this.valorSegurado = valorSegurado;
        this.valorBase = valorBase;
    }

    public double calcularPremio() {
        return valorBase;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public void setValorSegurado(double valorSegurado) {
        this.valorSegurado = valorSegurado;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

}

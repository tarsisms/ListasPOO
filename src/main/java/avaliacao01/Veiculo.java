package avaliacao01;

abstract class Veiculo {
    private String placa;
    private String modelo;
    private String marca;
    private double precoDiaria;
    private double imposto;
    private boolean status;

    public Veiculo(String placa, String modelo, String marca, double precoDiaria, double imposto) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.precoDiaria = precoDiaria;
        this.imposto = imposto;
        this.status = false;
    }

    public double calcularValorAluguel(int numeroDiarias) {
        return numeroDiarias * precoDiaria;
    }

    public abstract double calcularValorFinalAluguel(int numeroDiarias);

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public double getImposto() {
        return this.imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

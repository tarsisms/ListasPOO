package avaliacao01;

class Caminhonete extends Veiculo {
    public Caminhonete(String placa, String modelo, String marca, double precoDiaria) {
        super(placa, modelo, marca, precoDiaria, 0.10);  // Imposto de 10% para Caminhonete
    }

    @Override
    public double calcularValorFinalAluguel(int numeroDiarias) {
        double valorAluguel = calcularValorAluguel(numeroDiarias);
        return valorAluguel * (getImposto() + 1);
    }
}

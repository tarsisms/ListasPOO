package avaliacao01;

class Automovel extends Veiculo {
    public Automovel(String placa, String modelo, String marca, double precoDiaria) {
        super(placa, modelo, marca, precoDiaria, 0.05);
    }

    @Override
    public double calcularValorFinalAluguel(int numeroDiarias) {
        double valorAluguel = calcularValorAluguel(numeroDiarias);
        return valorAluguel * (getImposto() + 1);
    }
}

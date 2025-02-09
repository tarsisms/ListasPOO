package avaliacao01;

class Eletrico extends Veiculo {
    public Eletrico(String placa, String modelo, String marca, double precoDiaria) {
        super(placa, modelo, marca, precoDiaria, 0.0);
    }

    @Override
    public double calcularValorFinalAluguel(int numeroDiarias) {
        double valorAluguel = calcularValorAluguel(numeroDiarias);
        return valorAluguel * (getImposto() + 1);
    }
}


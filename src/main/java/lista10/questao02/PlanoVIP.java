package lista10.questao02;

public class PlanoVIP extends PlanoAcademia {

    public PlanoVIP(int codigo, String nomeCliente, int idade, int periodoContratoMeses) {
        super(codigo, nomeCliente, idade, 250, periodoContratoMeses);
    }

    @Override
    public double calcularMensalidade() {
        double mensalidade = super.getValorBase();

        if (super.getPeriodoContratoMeses() >= 12) {
            mensalidade -= mensalidade * 0.20;
        } else if (super.getPeriodoContratoMeses() >= 6) {
            mensalidade -= mensalidade * 0.10;
        }

        if (super.getIdade() >= 60) {
            mensalidade -= mensalidade * 0.10;
        }

        return mensalidade;
    }
}

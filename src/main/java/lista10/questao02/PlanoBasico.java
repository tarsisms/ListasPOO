package lista10.questao02;

public class PlanoBasico extends PlanoAcademia {

    public PlanoBasico(int codigo, String nomeCliente, int idade, int periodoContratoMeses) {
        super(codigo, nomeCliente, idade, 100, periodoContratoMeses);
    }

    @Override
    public double calcularMensalidade() {
        double mensalidade = super.getValorBase();

        if (super.getPeriodoContratoMeses() >= 12) {
            mensalidade -= mensalidade * 0.10;
        } else if (super.getPeriodoContratoMeses() >= 6) {
            mensalidade -= mensalidade * 0.05;
        }

        return mensalidade;
    }
}

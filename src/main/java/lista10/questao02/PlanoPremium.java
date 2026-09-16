package lista10.questao02;

public class PlanoPremium extends PlanoAcademia {

    public PlanoPremium(int codigo, String nomeCliente, int idade, int periodoContratoMeses) {
        super(codigo, nomeCliente, idade, 180, periodoContratoMeses);
    }

    @Override
    public double calcularMensalidade() {
        double mensalidade = super.getValorBase();

        if (super.getPeriodoContratoMeses() >= 12) {
            mensalidade -= mensalidade * 0.15;
        } else if (super.getPeriodoContratoMeses() >= 6) {
            mensalidade -= mensalidade * 0.08;
        }

        return mensalidade;
    }
}

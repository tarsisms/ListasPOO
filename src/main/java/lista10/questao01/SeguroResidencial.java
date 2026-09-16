package lista10.questao01;

public class SeguroResidencial extends Seguro {

    public SeguroResidencial(int codigo, String nomeSegurado, double valorSegurado, double valorBase) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
    }

    @Override
    public double calcularPremio() {
        return super.getValorBase() + (super.getValorSegurado() * 0.01);
    }
}

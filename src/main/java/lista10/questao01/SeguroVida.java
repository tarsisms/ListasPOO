package lista10.questao01;

public class SeguroVida extends Seguro {

    private int idadeSegurado;

    public SeguroVida(int codigo, String nomeSegurado, double valorSegurado, double valorBase, int idadeSegurado) {
        super(codigo, nomeSegurado, valorSegurado, valorBase);
        this.idadeSegurado = idadeSegurado;
    }

    @Override
    public double calcularPremio() {
        double premio = super.getValorBase() + (super.getValorSegurado() * 0.02);

        if (idadeSegurado > 55) {
            premio = premio + (premio * 0.20);
        }

        return premio;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }
}

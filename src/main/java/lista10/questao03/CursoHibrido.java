package lista10.questao03;

public class CursoHibrido extends Curso {

    private double valorPorHora;
    private double taxaInfraestrutura;

    public CursoHibrido(int codigo, String nomeCurso, int cargaHoraria, double valorBase, int numeroEstudantes,
                         double valorPorHora) {
        super(codigo, nomeCurso, cargaHoraria, valorBase, numeroEstudantes);
        this.valorPorHora = valorPorHora;
        this.taxaInfraestrutura = cargaHoraria * valorPorHora;
    }

    @Override
    public double calcularMensalidade() {
        return super.getValorBase() - (super.getValorBase() * 0.10) + (taxaInfraestrutura / 2);
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public double getTaxaInfraestrutura() {
        return taxaInfraestrutura;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public void setTaxaInfraestrutura(double taxaInfraestrutura) {
        this.taxaInfraestrutura = taxaInfraestrutura;
    }
}

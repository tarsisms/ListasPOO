package lista10.questao03;

public class CursoPresencial extends Curso {

    private double valorPorHora;
    private double taxaInfraestrutura;

    public CursoPresencial(int codigo, String nomeCurso, int cargaHoraria, double valorBase, int numeroEstudantes,
                            double valorPorHora) {
        super(codigo, nomeCurso, cargaHoraria, valorBase, numeroEstudantes);
        this.valorPorHora = valorPorHora;
        this.taxaInfraestrutura = cargaHoraria * valorPorHora;
    }

    @Override
    public double calcularMensalidade() {
        return super.getValorBase() + taxaInfraestrutura;
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

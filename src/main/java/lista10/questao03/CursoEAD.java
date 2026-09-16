package lista10.questao03;

public class CursoEAD extends Curso {

    public CursoEAD(int codigo, String nomeCurso, int cargaHoraria, double valorBase, int numeroEstudantes) {
        super(codigo, nomeCurso, cargaHoraria, valorBase, numeroEstudantes);
    }

    @Override
    public double calcularMensalidade() {
        return super.getValorBase() - (super.getValorBase() * 0.15);
    }
}

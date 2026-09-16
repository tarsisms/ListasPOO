package lista10.questao03;

public class Curso {

    private int codigo;
    private String nomeCurso;
    private int cargaHoraria;
    private double valorBase;
    private int numeroEstudantes;

    public Curso(int codigo, String nomeCurso, int cargaHoraria, double valorBase, int numeroEstudantes) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.cargaHoraria = cargaHoraria;
        this.valorBase = valorBase;
        this.numeroEstudantes = numeroEstudantes;
    }

    public double calcularMensalidade() {
        return valorBase;
    }

    public double calcularFaturamentoTotal() {
        return calcularMensalidade() * numeroEstudantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValorBase() {
        return valorBase;
    }

    public int getNumeroEstudantes() {
        return numeroEstudantes;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public void setNumeroEstudantes(int numeroEstudantes) {
        this.numeroEstudantes = numeroEstudantes;
    }
}

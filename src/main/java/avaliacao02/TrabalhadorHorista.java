package avaliacao02;

class TrabalhadorHorista extends Trabalhador {
    private int totalHoras;

    public TrabalhadorHorista(int matricula, String nome, int idade, double salarioBase, int totalHoras) {
        super(matricula, nome, idade, salarioBase);
        this.totalHoras = totalHoras;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() * totalHoras;
    }
}

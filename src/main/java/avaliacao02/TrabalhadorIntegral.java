package avaliacao02;

class TrabalhadorIntegral extends Trabalhador {
    public TrabalhadorIntegral(int matricula, String nome, int idade, double salarioBase) {
        super(matricula, nome, idade, salarioBase);
    }

    @Override
    public double calcularSalario() {
        if (super.getIdade() <= 30) {
            return super.getSalarioBase() * 1.16;
        } else {
            return super.getSalarioBase() * 1.25;
        }
    }
}

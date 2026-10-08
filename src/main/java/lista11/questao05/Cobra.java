package lista11.questao05;

public class Cobra extends Animal implements Andar, Nadar {
    public Cobra(String nome, int idade, double peso, double tamanho) {
        super(nome, idade, peso, tamanho);
    }

    @Override
    public String andar() {
        return super.getNome() + " Andar";
    }

    @Override
    public String nadar() {
        return super.getNome() + ": Nadar";
    }
}

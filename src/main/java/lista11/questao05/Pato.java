package lista11.questao05;

public class Pato extends Animal implements Andar, Nadar, Voar {
    public Pato(String nome, int idade, double peso, double tamanho) {
        super(nome, idade, peso, tamanho);
    }

    @Override
    public String andar() {
        return "Pato: Andar";
    }

    @Override
    public String nadar() {
        return "Pato: Nadar";
    }

    @Override
    public String voar() {
        return "Pato: Voar";
    }
}

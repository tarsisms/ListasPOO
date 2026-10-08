package lista11.questao05;

public class Cachorro extends Animal implements Andar, Nadar {
    public Cachorro(String nome, int idade, double peso, double tamanho) {
        super(nome, idade, peso, tamanho);
    }

    @Override
    public String andar() {
        return "Cachorro: Andar";

    }

    @Override
    public String nadar() {
        return "Cachorro: Nadar";
    }
}

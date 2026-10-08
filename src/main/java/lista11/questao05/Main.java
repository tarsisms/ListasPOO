package lista11.questao05;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Eugenio", 45, 100, 40);
        Pato pato = new Pato("Thiago", 45, 100, 40);
        Cobra cobra = new Cobra("VITORIA MARQUES, A CANINANA", 45, 20, 40);

        executarAcaoNadar(cachorro);
        executarAcaoNadar(pato);
        executarAcaoNadar(cobra);
    }

    public static void executarAcaoNadar(Nadar animal) {
        System.out.println(animal.nadar());
    }


}

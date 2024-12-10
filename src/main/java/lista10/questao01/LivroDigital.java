package lista10.questao01;


class LivroDigital extends Livro {

    public LivroDigital(int codigo, String titulo, String editora, String autor, int quantidade, double precoUnitario) {
        super(codigo, titulo, editora, autor, quantidade, precoUnitario);
    }

    @Override
    public double calcularPrecoFinal(int quantidadeDesejada) {
        return precoUnitario * quantidadeDesejada;
    }
}

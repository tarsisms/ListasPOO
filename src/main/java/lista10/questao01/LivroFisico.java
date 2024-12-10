package lista10.questao01;


class LivroFisico extends Livro {
    private double peso;
    private double valorFretePorKg;

    public LivroFisico(int codigo, String titulo, String editora, String autor, int quantidade, double precoUnitario, double peso, double valorFretePorKg) {
        super(codigo, titulo, editora, autor, quantidade, precoUnitario);
        this.peso = peso;
        this.valorFretePorKg = valorFretePorKg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValorFretePorKg() {
        return valorFretePorKg;
    }

    public void setValorFretePorKg(double valorFretePorKg) {
        this.valorFretePorKg = valorFretePorKg;
    }

    public double calcularFrete() {
        return (peso * valorFretePorKg);
    }

    @Override
    public double calcularPrecoFinal(int quantidadeDesejada) {
        return (precoUnitario * quantidadeDesejada) + calcularFrete();
    }
}
package lista10.questao01;

abstract class Livro {
    protected int codigo;
    protected String titulo;
    protected String editora;
    protected String autor;
    protected int quantidade;
    protected double precoUnitario;

    public Livro(int codigo, String titulo, String editora, String autor, int quantidade, double precoUnitario) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autor = autor;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public abstract double calcularPrecoFinal(int quantidadeDesejada);

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}




public class Produto {
    private String nome;
    private double preco;

    /*Construtores*/
    Produto() {

    }

    Produto(String nome, double preço) {
        this.nome = nome;
        this.preco = preco;
    }

    /*Getters e Setters*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco(double preco) {
        return preco;
    }

    /*Método toString -> passamos o @override para sobscrever esse método padrão do java*/

    @Override

    public String toString() {
        return "Nome do produto: " + nome + "\nPreço do produto: " + preco;
    }


}

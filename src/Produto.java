import java.time.LocalDate;
import java.time.LocalDateTime;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    /*Construtores*/
    Produto() {

    }

    public Produto(String nome, double preco, int diaValidade, int mesValidade, int anoValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = new Data(diaValidade, mesValidade, anoValidade);
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

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    /* Métodos */
    public boolean estaVencido() {
        Data dataAtual = Data.dataAtual();
        return dataValidade.verificaVencimento(dataAtual);
    }

    /*Método toString -> passamos o @override para sobscrever esse método padrão do java*/
    @Override
    public String toString() {
        return "Nome do produto: " + nome +
                "\nPreço: R$" + preco +
                "\nValidade: " + dataValidade +
                "\nO produto está vencido? " + (estaVencido() ? "Sim" : "Não");
    }


}

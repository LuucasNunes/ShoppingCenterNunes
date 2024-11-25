public class Cosmetico extends Loja {
    private double taxaComercializacao;

    Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data data, Endereco endereco, double taxaComercializacao, int tamanhoDoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, data, endereco, tamanhoDoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de Comercialização: R$ " + taxaComercializacao;
    }
}
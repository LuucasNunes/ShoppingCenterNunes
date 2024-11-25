public class Bijuteria extends Loja {
    private double metaVendas;

    //Construtor completo
    Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
              Data data, Endereco endereco, double metaVendas, int tamanhoDoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, data, endereco, tamanhoDoEstoque);
        this.metaVendas = metaVendas;
    }

    //Getters e Setters
    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + "\nSua meta de vendas desse mês para a loja é: " + metaVendas;
    }
}

public class Vestuario extends Loja {
    private boolean produtosImportados;

    //Construtor completo
    Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
              Data data, Endereco endereco, boolean produtosImportados, int tamanhoDoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, data, endereco, tamanhoDoEstoque);
        this.produtosImportados = produtosImportados;
    }

    //Getters e Setters
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + "\nSua loja tem produtos importados: " + produtosImportados;
    }
}

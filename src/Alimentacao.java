public class Alimentacao extends Loja{
    private Data dataAlvara;

    //Construtor completo
    Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
              Data data, Endereco endereco, Data dataAlvara, int tamanhoDoEstoque ) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, data, endereco, tamanhoDoEstoque);
        this.dataAlvara = dataAlvara;
    }

    //Getters e Setters
    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + "\nData do alvará de funcionamento: " + dataAlvara;
    }
}

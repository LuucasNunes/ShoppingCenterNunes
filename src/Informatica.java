public class Informatica extends Loja{
    private double seguroEletronicos;

    //Construtor completo
    Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
              Data data, Endereco endereco, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, data, endereco);
        this.seguroEletronicos = seguroEletronicos;
    }

    //Getters e Setters
    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() + "\nSeguro a ser pago mensalmente: " + seguroEletronicos;
    }
}

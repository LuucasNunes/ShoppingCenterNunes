
public class Loja {
    /*atributos da loja -> Utilizamos Private para manter as alterações somente por métodos*/
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    /*Construtores da loja*/

    //Construtor padrão -> Não inicia nenhum atributo
    Loja() {

    }

    //Construtor com valores nome e qtd
    Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    //Construtor completo
    Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    /*Getters e Setters*/

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQtdFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQtdFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setSalarioFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = Loja.this.salarioBaseFuncionario;
    }

    public double getSalarioFuncionario() {
        return salarioBaseFuncionario;
    }

    /*Método toString -> passamos o @override para sobscrever esse método padrão do java*/

    @Override

    public String toString() {
        return "Nome da loja: " + nome + "\nNúmero de funcionários: "
                + quantidadeFuncionarios + "\nSalário: "
                + salarioBaseFuncionario;
    }

    /*Outros métodos*/
    public float gastosComSalario() {
        if (this.salarioBaseFuncionario == -1) {
            return -1;
        } else {
            return (float) (salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }


}

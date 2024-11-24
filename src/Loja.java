public class Loja {
    /*atributos da loja -> Utilizamos Private para manter as alterações somente por métodos*/
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data data;
    private String tipoDeLoja;

    /*Construtores da loja*/

    //Construtor padrão -> Não inicia nenhum atributo
    Loja() {

    }

    //Construtor com valores nome e qtd
    Loja(String nome, int quantidadeFuncionarios, Data data, Endereco endereco) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.data = data;
    }

    //Construtor completo
    Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data data, Endereco endereco) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.data = data;
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

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    /*Método toString -> passamos o @override para sobscrever esse método padrão do java*/

    @Override

    public String toString() {
        return "Nome da loja: " + nome
                + "\nNúmero de funcionários: " + quantidadeFuncionarios
                + "\nSalário: " + salarioBaseFuncionario
                + "\n" + data
                + "\n" + endereco
                + "\n" + tipoDeLoja;
    }

    /*Outros métodos*/
    public String gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return "Cálculo não pode ser realizado, pois o salário base é -1";
        } else {
            return ("O gasto da sua loja com salários é: " + (salarioBaseFuncionario * quantidadeFuncionarios));
        }
    }

    public String tamanhoLoja() {
        if (quantidadeFuncionarios < 10) {
            return ("Sua loja tem o tamanho P");
        } else if ((quantidadeFuncionarios >= 10) && (quantidadeFuncionarios < 30)) {
            return ("Sua loja tem o tamanho M");
        } else if (quantidadeFuncionarios >= 30) {
            return ("Sua loja tem o tamanho G");
        } else {
            return ("Sua loja ainda não tem funcionários");
        }
    }

}

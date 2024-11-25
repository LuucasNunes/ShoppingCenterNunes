import java.util.Arrays;

public class Loja {
    /*atributos da loja -> Utilizamos Private para manter as alterações somente por métodos*/
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data data;
    private String tipoDeLoja;
    private Produto[] estoqueProdutos;

    /*Construtores da loja*/

    //Construtor padrão -> Não inicia nenhum atributo
    Loja() {
    }

    //Construtor com valores nome e qtd
    Loja(String nome, int quantidadeFuncionarios, Data data, Endereco endereco, int tamanhoDoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.data = data;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[tamanhoDoEstoque];
    }

    //Construtor completo
    Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Data data, Endereco endereco, int tamanhoDoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.data = data;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[tamanhoDoEstoque];
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
        this.salarioBaseFuncionario = salarioBaseFuncionario;
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

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    /*Método toString -> passamos o @override para sobrescrever esse método padrão do java*/

    @Override
    public String toString() {
        return "Nome da loja: " + nome
                + "\nNúmero de funcionários: " + quantidadeFuncionarios
                + "\nSalário: " + salarioBaseFuncionario
                + "\n" + data
                + "\n" + endereco
                + "\n" + tipoDeLoja
                + "\nEstoque: " + (estoqueProdutos != null ? estoqueProdutos.length + " produtos registrados" : "Estoque não definido");
    }

    /*Outros métodos*/

    public String gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return "Cálculo não pode ser realizado, pois o salário base é -1";
        } else {
            return "O gasto da sua loja com salários é: " + (salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }

    public String tamanhoLoja() {
        if (quantidadeFuncionarios < 10) {
            return "Sua loja tem o tamanho P";
        } else if (quantidadeFuncionarios < 30) {
            return "Sua loja tem o tamanho M";
        } else if (quantidadeFuncionarios >= 30) {
            return "Sua loja tem o tamanho G";
        } else {
            return "Sua loja ainda não tem funcionários";
        }
    }

    public String imprimeProdutos() {
        if (estoqueProdutos == null || estoqueProdutos.length == 0) {
            return "Sua loja não tem produtos registrados!";
        }
        return Arrays.toString(estoqueProdutos);
    }

    //Métodos insere e remove produto, substituindo null e retornando boolean
    public boolean insereProduto(Produto produto) {
        if (estoqueProdutos == null) {
            return false;
        }

        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        if (estoqueProdutos == null) {
            return false;
        }

        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

}

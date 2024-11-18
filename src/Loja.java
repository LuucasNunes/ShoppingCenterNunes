
public class Loja {
    /*atributos da loja */
    String nome;
    int quantidadeFuncionarios;
    double salarioBaseFuncionario;

    /*construtores da loja*/

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
}

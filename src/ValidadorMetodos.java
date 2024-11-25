import java.time.LocalDate;

public class ValidadorMetodos {
    public static void main(String[] args) {
        testarData();
        testarEndereco();
        testarLoja();
        testarSubclassesLoja();
        testarShopping();
    }

    /* Testando a classe Data */
    private static void testarData() {
        System.out.println("== Testando a classe Data ==\n");

        // Teste do construtor padrão
        Data dataPadrao = new Data();
        System.out.println("Construtor padrão: " + dataPadrao + "\n");

        // Teste do construtor com validação
        Data dataValida = new Data(29, 2, 2020); // Ano bissexto
        System.out.println("Data válida (ano bissexto): " + dataValida + "\n");

        Data dataInvalida = new Data(31, 4, 2023); // Data inválida
        System.out.println("Data inválida (ajustada para padrão): " + dataInvalida + "\n");

        // Teste de métodos
        System.out.println("Ano bissexto: " + dataValida.verificaAnoBissexto() + "\n");

        Data dataComparacao = new Data(28, 2, 2020);
        System.out.println("Data " + dataComparacao + " é anterior a " + dataValida + "? " + dataComparacao.verificaVencimento(dataValida) + "\n");

        // Teste de método estático
        Data dataAtual = Data.dataAtual();
        System.out.println("Data atual (método estático): " + dataAtual + "\n");
    }

    /* Testando a classe Endereco */
    private static void testarEndereco() {
        System.out.println("== Testando a classe Endereco ==\n");

        // Teste do construtor completo
        Endereco endereco = new Endereco("Rua A", "Porto Alegre", "Brasil", "90000-000", "123", "Apto 101");
        System.out.println("Endereço completo: \n" + endereco + "\n");

        // Teste de getters e setters
        endereco.setNomeDaRua("Rua Nova");
        endereco.setCidade("Florianópolis");
        endereco.setCep("88000-000");
        endereco.setNumero("456");
        endereco.setComplemento("Apto 202");

        System.out.println("Nome da rua atualizado: " + endereco.getNomeDaRua() + "\n");
        System.out.println("Cidade atualizada: " + endereco.getCidade() + "\n");
        System.out.println("CEP atualizado: " + endereco.getCep() + "\n");
        System.out.println("Número atualizado: " + endereco.getNumero() + "\n");
        System.out.println("Complemento atualizado: " + endereco.getComplemento() + "\n");
    }

    /* Testando a classe Loja */
    private static void testarLoja() {
        System.out.println("== Testando a classe Loja ==\n");

        // Criando uma loja genérica
        Data dataFundacao = new Data(1, 1, 2000);
        Endereco endereco = new Endereco("Av. Principal", "São Paulo", "Brasil", "12345-678", "100", "Loja 10");
        Loja loja = new Loja("Loja Teste", 10, 2000.00, dataFundacao, endereco, 100);

        // Teste de getters
        System.out.println("Nome da loja: " + loja.getNome() + "\n");
        System.out.println("Quantidade de funcionários: " + loja.getQtdFuncionarios() + "\n");
        System.out.println("Salário base: R$ " + loja.getSalarioFuncionario() + "\n");
        System.out.println("Tamanho do estoque: " + loja.getEstoqueProdutos().length + "\n");

        // Teste de setters
        loja.setNome("Loja Atualizada");
        loja.setQtdFuncionarios(15);
        loja.setSalarioFuncionario(2500.00);

        System.out.println("Nome atualizado: " + loja.getNome() + "\n");
        System.out.println("Quantidade de funcionários atualizada: " + loja.getQtdFuncionarios() + "\n");
        System.out.println("Salário base atualizado: R$ " + loja.getSalarioFuncionario() + "\n");
        System.out.println("Tamanho do estoque atualizado: " + loja.getEstoqueProdutos().length + "\n");

        // Teste do método gastosComSalario
        System.out.println("Gastos com salários: R$ " + loja.gastosComSalario() + "\n");
    }

    /* Testando as subclasses de Loja */
    private static void testarSubclassesLoja() {
        System.out.println("== Testando as subclasses de Loja ==\n");

        Data dataFundacao = new Data(5, 6, 2015);
        Endereco endereco = new Endereco("Rua B", "Curitiba", "Brasil", "80000-000", "456", "Loja 20");

        // Testando Cosmetico
        Cosmetico cosmetico = new Cosmetico("Loja de Cosméticos", 5, 1500.00, dataFundacao, endereco, 10.0, 50);
        System.out.println("Loja de Cosméticos: \n" + cosmetico + "\n");
        System.out.println("Taxa de comercialização: R$ " + cosmetico.getTaxaComercializacao() + "\n");

        // Testando Bijuteria
        Bijuteria bijuteria = new Bijuteria("Loja de Bijuterias", 8, 1200.00, dataFundacao, endereco, 5000.0, 100);
        System.out.println("Loja de Bijuterias: \n" + bijuteria + "\n");
        System.out.println("Meta de vendas: " + bijuteria.getMetaVendas() + "\n");
    }

    /* Testando a classe Shopping */
    private static void testarShopping() {
        System.out.println("== Testando a classe Shopping ==\n");

        Shopping shopping = new Shopping(5);

        Data dataFundacao = new Data(12, 8, 2010);
        Endereco endereco = new Endereco("Rua C", "Rio de Janeiro", "Brasil", "20000-000", "789", "Loja 30");

        // Criando lojas
        Loja loja1 = new Loja("Loja Geral 1", 12, 1800.00, dataFundacao, endereco, 200);
        Loja loja2 = new Cosmetico("Loja de Cosméticos 2", 7, 1600.00, dataFundacao, endereco, 15.0, 100);

        // Testando inserção
        shopping.insereLoja(loja1);
        shopping.insereLoja(loja2);
        System.out.println("Lojas no shopping após inserção:\n");
        shopping.imprimeLojas();

        // Testando remoção
        shopping.removeLoja("Loja Geral 1");
        System.out.println("Lojas no shopping após remoção:\n");
        shopping.imprimeLojas();

        // Testando quantidade de lojas por tipo
        System.out.println("Quantidade de lojas do tipo 'Cosmetico': " + shopping.quantidadeLojasPorTipo("Cosmetico") + "\n");

        // Testando loja com seguro mais caro
        Loja lojaMaisCara = shopping.lojaSeguroMaisCaro();
        System.out.println("Loja com seguro mais caro: " + lojaMaisCara + "\n");
    }
}

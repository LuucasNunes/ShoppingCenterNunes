import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.forLanguageTag("pt-BR"));
        int lerInt;

        ArrayList<Loja> lojas = new ArrayList<>(); // Lista de lojas global

        do {
            System.out.println("(1) Criar uma loja\n" + "(2) Criar um produto\n" + "(3) Sair\n");
            System.out.printf("Informe uma opção: ");
            while (!ler.hasNextInt()) {
                System.out.println("Por favor, insira um número válido!");
                ler.next();
                System.out.printf("Informe uma opção: ");
            }
            lerInt = ler.nextInt();

            switch (lerInt) {
                case 1:
                    int continuarCriando;
                    int lojaContador = 1;
                    do {
                        System.out.println("\n-| Você escolheu: Criar uma loja. |-");
                        System.out.println("\n!--- Dados Gerais da Loja ---!");
                        System.out.println("Digite qual o tipo da sua loja: (1) Cosméticos, (2) Vestuários, " +
                                "(3) Bijuterias, (4) Alimentação ou (5) Informática: ");
                        int escolheTipo = ler.nextInt();

                        // Variáveis gerais
                        System.out.println("\nDigite um nome pra sua Loja: ");
                        ler.nextLine(); // Consumir newline
                        String nomeDaLoja = ler.nextLine();
                        System.out.println("\nDigite a quantidade de funcionários: ");
                        int qtdFunc = ler.nextInt();
                        System.out.println("\nDigite o salário base dos funcionários: ");
                        double salaBaseFunc = ler.nextDouble();
                        System.out.println("\nQual o tamanho do seu estoque de produtos? ");
                        int estoqueProdutos = ler.nextInt();
                        System.out.println("\n!--- Data de criação da loja ---!");
                        System.out.println("Digite o dia da criação da loja: ");
                        int diaCriaLoja = ler.nextInt();
                        System.out.println("\nDigite o mês da criação da loja: ");
                        int mesCriaLoja = ler.nextInt();
                        System.out.println("\nDigite o ano da criação da loja: ");
                        int anoCriaLoja = ler.nextInt();
                        System.out.println("\n!--- Endereço da loja ---!");
                        ler.nextLine();
                        System.out.println("Digite a rua da loja: ");
                        String nomeDaRua = ler.nextLine();
                        System.out.println("\nDigite o nome da cidade: ");
                        String nomeDaCidade = ler.nextLine();
                        System.out.println("\nDigite o país: ");
                        String paisDaLoja = ler.nextLine();
                        System.out.println("\nDigite o CEP da loja: ");
                        String cepDaLoja = ler.nextLine();
                        System.out.println("\nDigite o número da loja: ");
                        String numDaLoja = ler.nextLine();
                        System.out.println("\nDigite o complemento da loja: ");
                        String compDaLoja = ler.nextLine();

                        Data dataCriacao = new Data(diaCriaLoja, mesCriaLoja, anoCriaLoja);
                        Endereco enderecoDaLoja = new Endereco(nomeDaRua, nomeDaCidade, paisDaLoja, cepDaLoja, numDaLoja, compDaLoja);
                        Loja loja = null;

                        switch (escolheTipo) {
                            case 1: // Cosméticos
                                System.out.println("\nDigite a taxa de comercialização: ");
                                double taxaComercializacao = ler.nextDouble();
                                loja = new Cosmetico(nomeDaLoja, qtdFunc, salaBaseFunc, dataCriacao, enderecoDaLoja, taxaComercializacao, estoqueProdutos);
                                break;
                            case 2: // Vestuário
                                System.out.println("\nA loja vende produtos importados? (1)Sim ou (2)Não: ");
                                int escolheOpcao = ler.nextInt();
                                boolean produtosImportados = escolheOpcao == 1;
                                loja = new Vestuario(nomeDaLoja, qtdFunc, salaBaseFunc, dataCriacao, enderecoDaLoja, produtosImportados, estoqueProdutos);
                                break;
                            case 3: // Bijuterias
                                System.out.println("\nQual a meta de vendas desse mês: ");
                                double metaVendas = ler.nextDouble();
                                loja = new Bijuteria(nomeDaLoja, qtdFunc, salaBaseFunc, dataCriacao, enderecoDaLoja, metaVendas, estoqueProdutos);
                                break;
                            case 4: // Alimentação
                                System.out.println("\n -> Digite a data que a loja recebeu o alvará <-");
                                System.out.println("Digite o dia do alvará: ");
                                int diaDoAlvara = ler.nextInt();
                                System.out.println("\nDigite o mês do alvará: ");
                                int mesDoAlvara = ler.nextInt();
                                System.out.println("\nDigite o ano do alvará: ");
                                int anoDoAlvara = ler.nextInt();
                                Data dataAlvara = new Data(diaDoAlvara, mesDoAlvara, anoDoAlvara);
                                loja = new Alimentacao(nomeDaLoja, qtdFunc, salaBaseFunc, dataCriacao, enderecoDaLoja, dataAlvara, estoqueProdutos);
                                break;
                            case 5: // Informática
                                System.out.println("Digite o valor do seguro eletrônico: ");
                                double seguroEletronicos = ler.nextDouble();
                                loja = new Informatica(nomeDaLoja, qtdFunc, salaBaseFunc, dataCriacao, enderecoDaLoja, seguroEletronicos, estoqueProdutos);
                                break;
                            default:
                                System.out.println("Opção inválida.");
                                break;
                        }

                        if (loja != null) {
                            lojas.add(loja);
                            System.out.println("\n" + loja);
                        }

                        System.out.println("\nVocê deseja criar mais uma loja? (1)Sim (2)Não: ");
                        continuarCriando = ler.nextInt();
                    } while (continuarCriando == 1);

                    System.out.println("--------------------------------------");
                    System.out.println("\nResumo de todas as lojas criadas:");
                    for (int i = 0; i < lojas.size(); i++) {
                        System.out.println("\nLoja " + (i + 1) + ":");
                        System.out.println(lojas.get(i));
                    }
                    System.out.println("--------------------------------------\n");
                    break;

                case 2:
                    System.out.println("\n -|Você escolheu: Criar um produto.|-");
                    System.out.println("\nInforme o nome do produto:");
                    ler.nextLine(); // Consumir o newline
                    String nomeProduto = ler.nextLine();

                    System.out.println("\nInforme o preço do produto:");
                    double precoProduto = ler.nextDouble();

                    System.out.println("\nInforme o dia de validade do produto:");
                    int diaValidade = ler.nextInt();

                    System.out.println("\nInforme o mês de validade do produto:");
                    int mesValidade = ler.nextInt();

                    System.out.println("\nInforme o ano de validade do produto:");
                    int anoValidade = ler.nextInt();

                    Produto novoProduto = new Produto(nomeProduto, precoProduto, diaValidade, mesValidade, anoValidade, 0);

                    System.out.println("\nProduto criado com sucesso:\n" + novoProduto);

                    System.out.println("\nInforme o índice da loja (1, 2, ...) onde deseja adicionar o produto:");
                    int indiceLoja = ler.nextInt();

                    if (indiceLoja > 0 && indiceLoja <= lojas.size()) {
                        Loja lojaEscolhida = lojas.get(indiceLoja - 1);
                        boolean inserido = lojaEscolhida.insereProduto(novoProduto); // Chama o método insereProduto
                        if (inserido) {
                            System.out.println("\nProduto adicionado à loja " + lojaEscolhida.getNome() + "\n");
                        } else {
                            System.out.println("\nErro: Não foi possível adicionar o produto à loja.");
                        }
                    } else {
                        System.out.println("\nÍndice inválido. Produto não foi adicionado a nenhuma loja.");
                    }
                    break;

                case 3:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Digite uma opção válida.\n");
            }
        } while (lerInt != 3); // Saindo do programa
    }
}

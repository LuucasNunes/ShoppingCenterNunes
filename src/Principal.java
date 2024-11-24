import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.forLanguageTag("pt-BR"));
        int lerInt;

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
                    int continuarCriando = ler.nextInt();
                    ArrayList<Loja> lojas = new ArrayList<>();
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
                            case 1:
                                System.out.println("\nDigite a taxa de comercialização: ");
                                double taxaComercializacao = ler.nextDouble();
                                loja = new Cosmetico(nomeDaLoja, qtdFunc, salaBaseFunc, dataCriacao, enderecoDaLoja, taxaComercializacao);
                                break;
                            case 2:
                                /*System.out.println("A loja vende produtos importados? (true/false): ");
                                boolean produtosImportados = ler.nextBoolean();
                                loja = new Vestuario(nomeDaLoja, qtdFunc, salaBaseFunc, dataCriacao, enderecoDaLoja, produtosImportados);*/
                                break;
                            case 3:
                                // Criar a loja de Bijuteria (similar)
                                break;
                            case 4:
                                // Criar a loja de Alimentação (similar)
                                break;
                            case 5:
                                // Criar a loja de Informática (similar)
                                break;
                            default:
                                System.out.println("Opção inválida.");
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
                    System.out.println("\nVocê escolheu: Criar um produto.");
                    break;
                case 3:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Digite uma opção válida.\n");
            }
        } while (lerInt != 3); // Saindo do programa
        ler.close();
    }
}
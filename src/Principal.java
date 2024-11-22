import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int lerInt;

        do {
            System.out.println("(1) Criar uma loja\n" + "(2) Criar um produto\n" + "(3) Sair\n");
            System.out.printf("Informe uma opção: ");
            while (!ler.hasNextInt()) {
                System.out.println("Por favor, insira um número válido!");
                ler.next(); // Consome a entrada inválida
                System.out.printf("Informe uma opção: ");
            }
            lerInt = ler.nextInt();

            switch (lerInt) {
                case 1:
                    int continuarCriando = ler.nextInt();
                    do {
                        System.out.println("Você escolheu: Criar uma loja.\n");
                        System.out.println("Digite um nome para sua Loja: ");
                        ler.nextLine();
                        String nomeDaLoja = ler.nextLine();
                        System.out.println("\nDigite a quantidade de funcionários: ");
                        int qtdFunc = ler.nextInt(); // !! fazer if para validar a data usando Data
                        System.out.println("\nDigite o salário base dos funcionários: ");
                        double salaBaseFunc = ler.nextDouble();
                        System.out.println("\nDigite o dia da criação da loja: ");
                        int diaCriaLoja = ler.nextInt();
                        System.out.println("\nDigite o mês da criação da loja: ");
                        int mesCriaLoja = ler.nextInt();
                        System.out.println("\nDigite o ano da criação da loja: ");
                        int anoCriaLoja = ler.nextInt();
                        System.out.println("\nVocê criou essa loja: \n" + "Nome da loja: " + nomeDaLoja
                                + "\nQuantidade de funcionarios: " + qtdFunc
                                + "\nSalário base dos funcionários: " + salaBaseFunc
                                + "\nData da criação da loja: " + diaCriaLoja + "/" + mesCriaLoja + "/" + anoCriaLoja + "\n");
                        System.out.println("Você deseja criar mais uma loja? (1)Sim (2)Não");
                        continuarCriando = ler.nextInt();
                    } while (continuarCriando == 1);
                    break;
                case 2:
                    System.out.println("Você escolheu: Criar um produto.");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Digite uma opção válida.\n");
            }
        } while (lerInt != 3); // Saindo do programa
        ler.close();
    }
}


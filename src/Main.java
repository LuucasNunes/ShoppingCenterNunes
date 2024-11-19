public class Main {

    public static void main(String[] args) {

        Loja newSchool = new Loja();
        Loja theShield = new Loja("TheShield", 15);
        Loja dexterJeans = new Loja("DexterJeans", 30, 3000.00);
        Loja testandoNew = new Loja("testandoNew", 0, 0);

        System.out.println(dexterJeans);
        System.out.println(testandoNew.tamanhoLoja());
        System.out.println(dexterJeans.gastosComSalario());
    }
}
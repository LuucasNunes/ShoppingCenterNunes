public class Shopping {
    private Loja[] lojas;
    private int numeroLojas;

    Shopping(){

    }

    public Shopping(int capacidade) {
        this.lojas = new Loja[capacidade];
        this.numeroLojas = 0;
    }

    public boolean insereLoja(Loja loja) {
        if (numeroLojas < lojas.length) {
            lojas[numeroLojas] = loja;
            numeroLojas++;
            return true;
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < numeroLojas; i++) {
            if (lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = lojas[numeroLojas - 1]; // Substitui a loja removida pela última loja
                lojas[numeroLojas - 1] = null; // Limpa a última posição
                numeroLojas--; // Diminui o número de lojas
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getClass().getSimpleName().equals(tipoLoja)) {
                contador++;
            }
        }
        if (contador == 0) {
            return -1; // Retorna -1 caso o tipo seja inválido ou não tenha lojas desse tipo
        }
        return contador;
    }

    public Loja lojaSeguroMaisCaro() {
        Loja lojaMaisCara = null;
        double maiorSeguro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaMaisCara = loja;
                }
            }
        }

        return lojaMaisCara;
    }

    public void imprimeLojas() {
        for (Loja loja : lojas) {
            if (loja != null) {
                System.out.println(loja);
            }
        }
    }
}

public class Data {
    private int dia;
    private int mes;
    private int ano;

    /*Construtores*/

    Data() {

    }

    /*Construtor completo com validação de data*/
    Data(int dia, int mes, int ano) {
        boolean dataValida = false;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                dataValida = (dia >= 1 && dia <= 31);
                break;
            case 4, 6, 9, 11:
                dataValida = (dia >= 1 && dia <= 30);
                break;
            case 2:
                if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                    dataValida = (dia >= 1 && dia <= 29);
                } else {
                    dataValida = (dia >= 1 && dia <= 28);
                }
                break;
        }

        if (!dataValida) {
            System.out.println("Data inválida. Definindo data padrão 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    /*Getters e Setters*/
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes() {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAno() {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Data da criação da loja: " + dia + "/" + mes + "/" + ano;
    }

    /*Outros métodos*/
    public String verificaAnoBissexto() {
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            return "O ano " + ano + " é bissexto.";
        } else {
            return "O ano " + ano + " não é bissexto.";
        }
    }
}

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String pais;
    private String cep;
    private String numero;
    private String complemento;

    /* Construtores */

    Endereco() {

    }

    Endereco(String nomeDaRua, String cidade, String pais, String cep, String numero, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    /*Getters e Setters*/


    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;

    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    /*Método toString -> passamos o @override para sobscrever esse método padrão do java*/
    @Override

    public String toString() {
        return "Nome da rua: " + nomeDaRua + "\nCidade: "
                + cidade + "\nPaís: " + pais + "\nCep: " + cep
                + "\nNúmero da rua: " + numero + "\nCompleto: " + complemento;
    }
}

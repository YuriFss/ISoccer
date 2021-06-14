package iSoccer;

public class Torcedor {

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String CPF;
    private double mensalidade;
    private boolean ad;

    public Torcedor(String nome, String email, String telefone, String endereco, String CPF, double mensalidade, boolean ad)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.CPF = CPF;
        this.mensalidade = mensalidade;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\ntelefone: " + telefone + "\nEndereço: " + endereco +
                "\nCPF: " + CPF + "\nMensalidade: " + mensalidade + "\nAdimplência: " + ad;
    }

    public boolean isAd() {
        return ad;
    }

    public void setAd(boolean ad) {
        this.ad = ad;
    }
}

package iSoccer;

public class Jogadores extends Funcionario{

    private String posicao;
    private boolean aptidao;

    public Jogadores(String nome, String email, String telefone, String CPF, double salario, String posicao, boolean aptidao)
    {
        super(nome, email, telefone, CPF, salario);
        this.posicao = posicao;
        this.aptidao = aptidao;
    }

    public boolean isAptidao() {
        return aptidao;
    }

    public void setAptidao(boolean aptidao) {
        this.aptidao = aptidao;
    }

    @Override
    public String toString() {
        return "------------ Jogador ------------\n" + super.toString() + "\nPosição: " + posicao + "\nAptidão: " + aptidao;
    }
}

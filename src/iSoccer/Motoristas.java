package iSoccer;

public class Motoristas extends Funcionario{

    private String habilitacao;

    public Motoristas(String nome, String email, String telefone, String CPF, double salario, String habilitacao)
    {
        super(nome, email, telefone, CPF, salario);
        this.habilitacao = habilitacao;
    }

    @Override
    public String toString() {
        return "------------ Motorista ------------\n" + super.toString() + "\nHabilitação: " + habilitacao;
    }
}

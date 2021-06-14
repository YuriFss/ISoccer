package iSoccer;

public class Cozinheiros extends Funcionario{

    public Cozinheiros(String nome, String email, String telefone, String CPF, double salario)
    {
        super(nome, email, telefone, CPF, salario);
    }

    @Override
    public String toString() {
        return "------------ Cozinheiro ------------\n" + super.toString();
    }
}

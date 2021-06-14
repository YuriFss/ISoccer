package iSoccer;

public class Presidente extends Funcionario{

    public Presidente(String nome, String email, String telefone, String CPF, double salario)
    {
        super(nome, email, telefone, CPF, salario);
    }

    @Override
    public String toString() {
        return "------------ Presidente ------------\n" + super.toString();
    }
}

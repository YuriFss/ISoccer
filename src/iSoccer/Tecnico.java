package iSoccer;

public class Tecnico extends Funcionario{

    public Tecnico(String nome, String email, String telefone, String CPF, double salario)
    {
        super(nome, email, telefone, CPF, salario);
    }

    @Override
    public String toString() {
        return "------------ Técnico ------------\n" + super.toString();
    }
}

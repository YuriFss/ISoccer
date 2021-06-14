package iSoccer;

public class Preparadores extends Funcionario{

    public Preparadores(String nome, String email, String telefone, String CPF, double salario)
    {
        super(nome, email, telefone, CPF, salario);
    }

    @Override
    public String toString() {
        return "------------ Preparador ------------\n" + super.toString();
    }
}

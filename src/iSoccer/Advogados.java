package iSoccer;

public class Advogados extends Funcionario{

    public Advogados(String nome, String email, String telefone, String CPF, double salario)
    {
        super(nome, email, telefone, CPF, salario);
    }

    @Override
    public String toString() {
        return "------------ Advogado ------------\n" + super.toString();
    }
}



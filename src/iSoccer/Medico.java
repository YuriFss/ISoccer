package iSoccer;

public class Medico extends Funcionario{

    private String CRM;

    public Medico(String nome, String email, String telefone, String CPF, double salario, String CRM)
    {
        super(nome, email, telefone, CPF, salario);
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "------------ Médico ------------\n" + super.toString() + "\nCRM: " + CRM;
    }

}

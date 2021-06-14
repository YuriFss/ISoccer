package iSoccer;

public class Funcionario {

    private String nome;
    private String email;
    private String telefone;
    private String CPF;
    private double salario;

    public Funcionario (String nome, String email, String telefone, String CPF, double salario)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.CPF = CPF;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\ntelefone: " + telefone + "\nCPF: " + CPF + "\nsalario: " + salario;
    }
}


package iSoccer;

public class Junior extends Torcedor{

    public Junior(String nome, String email, String telefone, String endereco, String CPF, double mensalidade, boolean ad)
    {
        super(nome, email, telefone, endereco , CPF, mensalidade, ad);
    }

    @Override
    public String toString() {
        return "------------ Junior ------------\n" + super.toString();
    }

}

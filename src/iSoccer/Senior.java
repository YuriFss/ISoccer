package iSoccer;

public class Senior extends Torcedor{

    public Senior(String nome, String email, String telefone, String endereco, String CPF, double mensalidade, boolean ad)
    {
        super(nome, email, telefone, endereco , CPF, mensalidade, ad);
    }

    @Override
    public String toString() {
        return "------------ Sênior ------------\n" + super.toString();
    }
}

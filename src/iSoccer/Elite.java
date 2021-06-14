package iSoccer;

public class Elite extends Torcedor{

    public Elite(String nome, String email, String telefone, String endereco, String CPF, double mensalidade, boolean ad)
    {
        super(nome, email, telefone, endereco , CPF, mensalidade, ad);
    }

    @Override
    public String toString() {
        return "------------ Elite ------------\n" + super.toString();
    }
}

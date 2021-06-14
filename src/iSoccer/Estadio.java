package iSoccer;

public class Estadio {

    private String nomeEst;
    private int capEst;
    private int banheiros;
    private int lanchonetes;

    public Estadio(String nomeEst, int capEst, int banheiros, int lanchonetes)
    {
        this.nomeEst = nomeEst;
        this.capEst = capEst;
        this.banheiros = banheiros;
        this.lanchonetes = lanchonetes;
    }

    public String getNomeEst() {
        return nomeEst;
    }

    public void setNomeEst(String nomeEst) {
        this.nomeEst = nomeEst;
    }

    public int getCapEst() {
        return capEst;
    }

    public void setCapEst(int capEst) {
        this.capEst = capEst;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getLanchonetes() {
        return lanchonetes;
    }

    public void setLanchonetes(int lanchonetes) {
        this.lanchonetes = lanchonetes;
    }
}

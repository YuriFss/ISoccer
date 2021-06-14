package iSoccer;

import java.util.ArrayList;

public class Clube {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Torcedor> torcedores = new ArrayList<>();
    private Onibus onibus;
    private Estadio estadio;
    private CT ct;
    private double taxaSenior = 300;
    private double taxaJunior = 100;
    private double taxaElite = 1000;

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Torcedor> getTorcedores() {
        return torcedores;
    }

    public void setTorcedores(ArrayList<Torcedor> torcedores) {
        this.torcedores = torcedores;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public CT getCt() {
        return ct;
    }

    public void setCt(CT ct) {
        this.ct = ct;
    }

    public double getTaxaSenior() {
        return taxaSenior;
    }

    public void setTaxaSenior(double taxaSenior) {
        this.taxaSenior = taxaSenior;
    }

    public double getTaxaJunior() {
        return taxaJunior;
    }

    public void setTaxaJunior(double taxaJunior) {
        this.taxaJunior = taxaJunior;
    }

    public double getTaxaElite() {
        return taxaElite;
    }

    public void setTaxaElite(double taxaElite) {
        this.taxaElite = taxaElite;
    }
}

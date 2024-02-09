package fr.diginamic.banque.entites;

public class Compte {
    protected String numDeCompte;
    protected double soldeCompte;

    public Compte(String numDeCompte, double soldeCompte) {
        this.numDeCompte = numDeCompte;
        this.soldeCompte = soldeCompte;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numDeCompte='" + numDeCompte + '\'' +
                ", soldeCompte=" + soldeCompte +
                '}';
    }
}

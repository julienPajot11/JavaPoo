package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private double taux;

    public CompteTaux(String numDeCompte, double soldeCompte, double taux) {
        super(numDeCompte, soldeCompte);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + "Taux de compte " + this.taux;
    }
}

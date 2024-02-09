package entites;

public class AdressePostale {
    private String numDeRue;
    private String libelleRue;
    private String codePostal;
    private String ville;

    public AdressePostale() {
        this("","","","");
    }

    public AdressePostale(String numDeRue, String libelleRue, String codePostal, String ville) {
        this.numDeRue = numDeRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}

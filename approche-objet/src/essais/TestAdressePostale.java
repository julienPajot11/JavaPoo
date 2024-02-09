package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse = new AdressePostale();
        adresse.codePostal = "85150";
        adresse.libelleRue = "laBas";
        adresse.numDeRue = "14";
        adresse.ville = "pasla";

        AdressePostale adresse2 = new AdressePostale();
        adresse.codePostal = "85000";
        adresse.libelleRue = "lesHerbiers";
        adresse.numDeRue = "14";
        adresse.ville = "genre";
    }
}

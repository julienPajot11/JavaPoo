package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale("14","lasBas","85000","PASICI");
        Personne p1 = new Personne("Julien","Pajot",adresse1);
        Personne p2 = new Personne();

        p1.afficherPrenom();
        /*
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

        Personne p1 = new Personne();
        p1.nom = "Julien";
        p1.prenom = "Pajot";
        p1.adresse = adresse;

        Personne p2 = new Personne();
        p1.nom = "GAAAALLAAAAAAAAAD";
        p1.prenom = "Dos santos";
        p1.adresse = adresse2;*/


    }
}

package sets;

public class Pays {
    public Pays(String nom, Integer nbhab, Double pib) {
        this.nom = nom;
        this.nbhab = nbhab;
        this.pib = pib;
    }

    public String nom;
    public Integer nbhab;
    public Double pib;

    /*@Override
    public int compareTo(Pays pays2) {
        int result = this.nom.compareTo(pays2.nom);
        return result;

    }*/


}

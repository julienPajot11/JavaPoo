package shifumi.entites;

public enum Coup {

    pierre(1,"pierre"),
    feuille(2,"feuille"),
    ciseau(3,"ciseau"),
    ;
    private int valeur;
    private String libelle;

    Coup(int valeur, String libelle) {
        this.valeur = valeur;
        this.libelle = libelle;
    }

    public static Coup getCoup(int valeur){
        Coup value  = null;
        switch (valeur){
            case 1:
                value = pierre;
                break;
            case 2:
                value = feuille;
                break;
            case 3:
                value = ciseau;
                break;
        }
        return value;
    }
    @Override
    public String toString() {
        return "Coup " + libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}

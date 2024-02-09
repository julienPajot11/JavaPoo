package shifumi.entites;

public class AffichageVictoire {
    private Coup coupPlayer;
    private Coup coupOrdinateur;
    private Player player;

    public AffichageVictoire(Coup coupPlayer, Coup coupOrdinateur, Player player) {
        this.coupPlayer = coupPlayer;
        this.coupOrdinateur = coupOrdinateur;
        this.player = player;
    }

    public static String TestVictoire(Coup coupPlayer,Coup coupOrdinateur , Player player){
        if (TestEgalite(coupPlayer,coupOrdinateur)){
            return  "Il y a une égalité";
        } else if (TestVictoireJoueur(coupPlayer,coupOrdinateur,player)) {
            return "Le joueur a gagné";
        }
        else{
            return "L'ordinateur a gagné";
        }
    }

    public static Boolean TestEgalite (Coup coupPlayer,Coup coupOrdinateur){
        if (coupOrdinateur == coupPlayer){
            return true;
        }
        return false;
    }

    public static Boolean TestVictoireJoueur (Coup coupPlayer,Coup coupOrdinateur , Player player){
        if (coupPlayer.getLibelle() == "pierre" && coupOrdinateur.getLibelle() =="ciseau"
                || coupPlayer.getLibelle() == "feuille" && coupOrdinateur.getLibelle() =="pierre"
                || coupPlayer.getLibelle() == "ciseau" && coupOrdinateur.getLibelle() =="feuille"){
            player.addScore();
            return true;

        }
        return false;
    }

}

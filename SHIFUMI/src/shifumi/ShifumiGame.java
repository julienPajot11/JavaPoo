package shifumi;

import shifumi.entites.AffichageVictoire;
import shifumi.entites.Coup;
import shifumi.entites.Player;
import java.util.Random;

import java.util.Scanner;

public class ShifumiGame {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("****************************************");
        System.out.println("**********  Shifumi Game    ************");
        System.out.println("****************************************");

        System.out.println("Entrer votre pseudo : ");
        Player player = new Player(sc.nextLine());
        System.out.println(player + " vs ordinateur" );
        Game(3,player);
    }

    public static void Game(int nbGame,Player player){
        for (int i = 0; i<nbGame; i++){
            System.out.println("Début de Game : ");


            Random rand = new Random();
            int randomNumOrdi = rand.nextInt((2)) + 1;

            Coup coupOrdinateur = Coup.getCoup(randomNumOrdi);

            System.out.println("1 ->" + Coup.pierre);
            System.out.println("2 ->" + Coup.feuille);
            System.out.println("3 ->" + Coup.ciseau);

            System.out.println("Entrer un coup : ");
            int coup = sc.nextInt();
            sc.nextLine();

            Coup coupPlayer = Coup.getCoup(coup);

            System.out.println("Vous avez jouer  : " + coupPlayer + " Coup de l'ordi " + coupOrdinateur);
            System.out.println(AffichageVictoire.TestVictoire(coupPlayer,coupOrdinateur,player));
            System.out.println("Score joueur "+player.getScore());
        }
    }
}

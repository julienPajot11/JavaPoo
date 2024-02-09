package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("REF1236",300000.2D);
        CompteTaux compteTaux  = new CompteTaux("REF859",100000.58,5.8);

        Compte[] comptes = {compte,compteTaux};
        for (Compte compt : comptes){
            System.out.println(compt);
        }
    }
}

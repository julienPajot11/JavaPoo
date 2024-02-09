package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("REF1236",300000.2D);
        System.out.println(compte);
    }
}

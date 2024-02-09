package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(2.5);
        Cercle c2 = new Cercle(3.5);

        System.out.println(c1.perimetreCercle());
        System.out.println(c1.surfaceCercle());

        System.out.println(c2.perimetreCercle());
        System.out.println(c2.surfaceCercle());


    }
}

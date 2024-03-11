package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

    public static void main(String args[]) {
        List<String> ville = new ArrayList<>();
        ville.add("Nice");
        ville.add("Carcassonne");
        ville.add("Narbonne");
        ville.add("Lyon");
        ville.add("Foix");
        ville.add("Pau");
        ville.add("Marseille");
        ville.add("Tarbes");

        System.out.println("Liste de départ");
        parcourir(ville);
        stringLePlusGrand(ville);
        majuscule(ville);
        suppressionAvecN(ville);
        parcourir(ville);


    }

    public static void parcourir(List<String> ville){
        for (int i = 0; i < ville.size(); i++) {
            System.out.println(ville.get(i));
        }
    }

    public static void stringLePlusGrand(List<String> ville){
        Integer max = 0;
        for (int i = 0; i < ville.size(); i++) {
            if ( ville.get(max).length() < ville.get(i).length()) {
                max= i;
            }

        }
        System.out.println("String le plus grand");
        System.out.println(ville.get(max));
    }

    public static void majuscule(List<String> ville){
        System.out.println("String en majuscule");
        for (int i = 0; i < ville.size(); i++) {
            ville.set(i, ville.get(i).toUpperCase());
            System.out.println(ville.get(i));

        }
    }

    public static void suppressionAvecN(List<String> ville){
        System.out.println("Suppression des string avec un n");
        Iterator<String> iter = ville.iterator();
        while (iter.hasNext()) {
            String character = iter.next();
            if (character.charAt(0) == 'N') {
                iter.remove();
            }
        }
        for (int i = 0; i < ville.size(); i++) {

            System.out.println(ville.get(i));
        }
    }
}

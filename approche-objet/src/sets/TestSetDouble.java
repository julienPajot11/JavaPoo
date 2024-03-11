package sets;

import java.util.*;

public class TestSetDouble {
    public static void main(String[] args) {
        Set<Double> set = new HashSet<>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);

        parcourir(set);
        plusGrand(set);
        supprimerPlusPetit(set);
        parcourir(set);


    }

    public static void parcourir(Set<Double> set){
        System.out.println("parcours de la liste :");
        Iterator<Double> iterator = set.iterator();
        while (iterator.hasNext()) {
            Double doubl = iterator.next();
            System.out.println(doubl);
        }
    }

    public static void plusGrand(Set<Double> set){
        Double max = Collections.max(set);
        System.out.println("plus grand élément de la liste : " + max.toString());

    }

    public static void supprimerPlusPetit(Set<Double> set){
        Double min = Collections.min(set);
        System.out.println("plus petit élément de la liste avant suppression : " + min.toString());

        Iterator<Double> iter = set.iterator();
        while (iter.hasNext()) {
            Double doubl = iter.next();
            if (doubl.equals(min)) {
                iter.remove();
            }
        }


    }
}

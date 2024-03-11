package listes;

import java.util.*;

public class TestListeInt {


    public static void main(String args[]) {
        List<Integer> nombre = new ArrayList<>();
        nombre.add(-1);
        nombre.add(5);
        nombre.add(7);
        nombre.add(3);
        nombre.add(-2);
        nombre.add(4);
        nombre.add(8);
        nombre.add(5);
        System.out.println("Liste de départ");
        for (int i = 0; i < nombre.size(); i++) {

            System.out.println(nombre.get(i));
        }
        System.out.println("taille de la liste");
        System.out.println(nombre.size());

        System.out.println("Le nombre max");
        System.out.println(Collections.max(nombre));

        System.out.println("Le nombre min");
        System.out.println(Collections.min(nombre));
        Iterator<Integer> iter = nombre.iterator();
        while (iter.hasNext()) {
            Integer nomb = iter.next();
            if (nomb.equals(Collections.min(nombre))) {
                iter.remove();
            }
        }
        System.out.println("Le nombre min après la suppresion");
        System.out.println(Collections.min(nombre));

        for (int i = 0; i < nombre.size(); i++) {
            if(nombre.get(i) <0 ) {
                System.out.println("Changement des négatifs en positif");
                nombre.set(i, Math.abs(nombre.get(i)));
            }

            System.out.println(nombre.get(i));
        }

    }
}

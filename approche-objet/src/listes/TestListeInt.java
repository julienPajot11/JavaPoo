package listes;

import sets.Pays;

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

        parcourir(nombre);
        tailleListe(nombre);
        plusGrandNombre(nombre);
        deletePlusPetitNombre(nombre);

    }

    public static void parcourir(List<Integer> nombre){
        for (Integer nb: nombre){
            System.out.println("Nombre : " + nb.toString());
        }
    }

    public static Integer tailleListe(List<Integer> nombre){
        System.out.println(nombre.size());
        return nombre.size();
    }

    public static Integer plusGrandNombre(List<Integer> nombre){
        System.out.println(Collections.max(nombre));
        return Collections.max(nombre);
    }

    public static Integer plusPetitNombre(List<Integer> nombre){
        System.out.println(Collections.min(nombre));
        return Collections.min(nombre);
    }

    public static void deletePlusPetitNombre(List<Integer> nombre){
        Iterator<Integer> iter = nombre.iterator();
        while (iter.hasNext()) {
            Integer nomb = iter.next();
            if (nomb.equals(plusPetitNombre(nombre))) {
                iter.remove();
            }
        }
        parcourir(nombre);
    }

    public static void absoluteNumber(List<Integer> nombre){
        for (int i = 0; i < nombre.size(); i++) {
            if(nombre.get(i) <0 ) {
                System.out.println("Changement des négatifs en positif");
                nombre.set(i, Math.abs(nombre.get(i)));
            }

            System.out.println(nombre.get(i));
        }
        parcourir(nombre);
    }
}

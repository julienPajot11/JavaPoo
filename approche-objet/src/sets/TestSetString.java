package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("USA");
        set.add("France");
        set.add("Allemagne");
        set.add("UK");
        set.add("Italie");
        set.add("Japon");
        set.add("Chine");
        set.add("Russie");
        set.add("Inde");

        parcoursList(set);
        plusGrandNombreLettre(set);
        deletePlusGrandNombreLettre(set);
    }

    public static String plusGrandNombreLettre(Set<String> set){
        String max = "";
        for(String ville : set){
            if(ville.length()> max.length()){
                max = ville;
            }
        }
        System.out.println(max);
        return max;
    }

    public static  void deletePlusGrandNombreLettre(Set<String> set){
        String deleteVille = plusGrandNombreLettre(set);
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String character = iter.next();
            if (character == deleteVille) {
                iter.remove();
            }
        }
        parcoursList(set);
    }

    public static void parcoursList(Set<String> set){
        System.out.println("Parcours de la liste");
        for(String ville : set){
            System.out.println(" la ville : " + ville);
        }
    }
}


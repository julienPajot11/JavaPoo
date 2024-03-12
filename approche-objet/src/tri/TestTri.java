package tri;

import sets.Pays;

import java.util.*;

public class TestTri {
    public static void main(String[] args){
        List<Pays> pays = new ArrayList<>();
        pays.add(new Pays("usa", 338000000, 75271.0));
        pays.add(new Pays("France", 68000000, 43302.0));
        pays.add(new Pays("Allemagne", 84200000, 51223.0));
        pays.add (new Pays("Royaume-Uni", 68500000, 50474.0));
        pays.add (new Pays("Italie", 60400000, 34952.0));
        pays.add (new Pays("Japon", 124700000, 40783.0));
        pays.add (new Pays("Inde", 1412400000, 2654.0));
        pays.add(new Pays("Chine", 1453400000, 13694.0));
        pays.add( new Pays("Russie", 146200000, 12146.0));

        System.out.println("premier affichage");
        parcourir(pays);
        System.out.println("-------------------------");
        Collections.sort(pays,new ComparatorHabitant());
        System.out.println("deuxième affichage : comparator habitant");
        parcourir(pays);
        System.out.println("-------------------------");
        System.out.println("troisième  affichage : comparator pib");
        parcourir(pays);
        Collections.sort(pays,new ComparatorPibHabitant());
    }

    public static void parcourir(List<Pays> pays){
        for (Pays pay: pays){
            System.out.println(pay.nom + " nbhab : " + pay.nbhab + " pib/hab : " + pay.pib);
        }
    }
}

package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeClass {
    public static void main(String args[]) {
        List<Ville> population = new ArrayList<>();
        population.add(new Ville("Nice",343000));
        population.add(new Ville("Carcassonne",47800));
        population.add(new Ville("Narbonne", 53400));
        population.add(new Ville("Lyon",484000));
        population.add(new Ville("Foix",9700));
        population.add(new Ville("Pau",77200));
        population.add(new Ville("Marseille",850700));
        population.add(new Ville("Tarbes",40600));

        parcourir(population);
        villePlusCentsMille(population);
        parcourir(population);
        villePlusPeupler(population);
        deleteVilleMoinsPeupler(population);
        parcourir(population);

    }
    public static void parcourir(List<Ville> population){
        for (int i = 0; i < population.size(); i++) {
            System.out.println("Nom de la ville : " + population.get(i).nom + " nombre d'hab : " + population.get(i).nbhabs.toString());

        }
    }

    public static void villePlusCentsMille(List<Ville> population){
        for (int i = 0; i < population.size(); i++) {
            if ( population.get(i).nbhabs > 100000 ) {
                population.set(i, new Ville(population.get(i).nom.toUpperCase(),population.get(i).nbhabs));
            }
        }
    }

    public static void villePlusPeupler(List<Ville> population){
        Ville max = population.get(0);
        for (int i = 0; i < population.size(); i++) {
            Ville challeger = population.get(i);
            if ( max.nbhabs < challeger.nbhabs ) {
                max= population.get(i);
            }

        }
        System.out.println("Ville la plus peuplé : " + max.nom + " nombre d'hab : " + max.nbhabs.toString());
    }

    public static Ville villeLaMoinsPeupler(List<Ville> population){
        Ville min = population.get(0);
        for (int i = 0; i < population.size(); i++) {
            Ville challeger = population.get(i);
            if ( min.nbhabs > challeger.nbhabs ) {
                min= population.get(i);
            }

        }
        return min;
    }

    public static void deleteVilleMoinsPeupler(List<Ville> population){
        Iterator<Ville> iter = population.iterator();
        while (iter.hasNext()) {
            Ville ville = iter.next();
            if (ville.equals(villeLaMoinsPeupler(population))) {
                iter.remove();
            }
        }
    }

}

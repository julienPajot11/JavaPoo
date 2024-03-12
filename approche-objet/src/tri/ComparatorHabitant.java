package tri;

import sets.Pays;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Pays> {


    @Override
    public int compare(Pays o1, Pays o2) {
        return -1 *  o1.nbhab.compareTo(o2.nbhab); //-1 * pour l'ordre décroissant
    }
}

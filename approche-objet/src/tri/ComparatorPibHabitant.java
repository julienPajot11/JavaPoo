package tri;

import sets.Pays;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {
    @Override
    public int compare(Pays o1, Pays o2) {
        return -1 * o1.pib.compareTo(o2.pib);
    }
}

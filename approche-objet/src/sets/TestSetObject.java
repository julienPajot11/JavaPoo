package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetObject {
    public static void main(String[] args) {
        Set<Pays> set = new HashSet<>();
        set.add(new Pays("usa", 338000000, 75271.0));
        set.add(new Pays("France", 68000000, 43302.0));
        set.add(new Pays("Allemagne", 84200000, 51223.0));
        set.add (new Pays("Royaume-Uni", 68500000, 50474.0));
        set.add (new Pays("Italie", 60400000, 34952.0));
        set.add (new Pays("Japon", 124700000, 40783.0));
        set.add (new Pays("Inde", 1412400000, 2654.0));
        set.add(new Pays("Chine", 1453400000, 13694.0));
        set.add( new Pays("Russie", 146200000, 12146.0));

        pibHab(set);
        pibTotal(set);
        paysMajuscule(set);
        deletePibPetit(set);
    }

    public static void pibHab (Set<Pays> pays){
        Double pibmax = 0.0;
        for (Pays pay: pays){
            if(pay.pib > pibmax){
                pibmax = pay.pib;
            }
        }
        System.out.println(pibmax);

    }

    public static Pays pibTotal(Set<Pays> pays){
        Pays payPibTotal = new Pays("France", 68000000, 43302.0);
        for (Pays pay: pays){
            if(pay.pib*pay.nbhab > payPibTotal.pib * payPibTotal.nbhab){
                payPibTotal = pay;
            }
        }
        System.out.println(payPibTotal.nom + " nbhab : " + payPibTotal.nbhab + " pib/hab : " + payPibTotal.pib + " total : " + payPibTotal.pib * payPibTotal.nbhab);
        return payPibTotal;
    }

    public static Pays pibTotalInferieur(Set<Pays> pays){
        Pays payPibTotal = new Pays("France", 68000000, 43302.0);
        for (Pays pay: pays){
            if(pay.pib*pay.nbhab < payPibTotal.pib * payPibTotal.nbhab){
                payPibTotal = pay;
            }
        }
        System.out.println(payPibTotal.nom + " nbhab : " + payPibTotal.nbhab + " pib/hab : " + payPibTotal.pib + " total : " + payPibTotal.pib * payPibTotal.nbhab);
        return payPibTotal;
    }

    public static void paysMajuscule(Set<Pays> pays){

        Pays payPibTotal = pibTotalInferieur(pays);
        for (Pays pay: pays){
            if(payPibTotal == pay ){
                pay.nom = pay.nom.toUpperCase();
                System.out.println(payPibTotal.nom + " nbhab : " + payPibTotal.nbhab + " pib/hab : " + payPibTotal.pib);
            }
        }
    }

    public static void deletePibPetit(Set<Pays> pays){

        Pays payPibTotal = pibTotalInferieur(pays);
        Iterator<Pays> iter = pays.iterator();
        while (iter.hasNext()) {
            Pays pay = iter.next();
            if (pay == payPibTotal) {
                iter.remove();
            }
        }
        parcourir(pays);

    }

    public static void parcourir(Set<Pays> pays){
        for (Pays pay: pays){
            System.out.println(pay.nom + " nbhab : " + pay.nbhab + " pib/hab : " + pay.pib);
        }
    }


}

package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Credit cr1 = new Credit("11/11/2003",200);
        Credit cr2 = new Credit("11/11/2003",200);
        Credit cr3 = new Credit("11/11/2003",200);
        Credit cr4 = new Credit("11/11/2003",200);

        Debit  d1 = new Debit("11/11/2011",10);
        Debit  d2 = new Debit("11/11/2011",10);
        Debit  d3 = new Debit("11/11/2011",10);
        Debit  d4 = new Debit("11/11/2011",10);
        Operation[] operations = {cr1,cr2,cr3,cr4,d1,d2,d3,d4};
        int result = 0;
        for (Operation ope : operations){
            System.out.println("Opération " + ope + " Type d'opé : " + ope.afficherType());

            if (ope.afficherType() == "Credit"){
                result += ope.getMontantOperation();
            } else if (ope.afficherType() == "Debit") {
                result-= ope.getMontantOperation();
            }
        }
        System.out.println(result);
    }
}

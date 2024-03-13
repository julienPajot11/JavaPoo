package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "livreta")
public class LivretA extends Compte{

    @Column(name = "TAUX")
    public double taux;

    public LivretA(String numero, Double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    public LivretA() {

    }
}

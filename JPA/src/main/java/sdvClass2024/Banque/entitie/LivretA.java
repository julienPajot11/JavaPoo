package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

@Entity
@Table(name = "livreta")
public class LivretA extends Compte{

    @Column(name = "TAUX")
    private double taux;
}

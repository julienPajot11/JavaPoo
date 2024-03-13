package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "assurancevie")
public class AssuranceVie extends Compte{

    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @Column(name="TAUX")
    private Double taux;

    public AssuranceVie(String numero, Double solde, LocalDate dateFin, Double taux) {
        super(numero, solde);
        this.dateFin = dateFin;
        this.taux = taux;
    }

    public AssuranceVie() {
    }


}

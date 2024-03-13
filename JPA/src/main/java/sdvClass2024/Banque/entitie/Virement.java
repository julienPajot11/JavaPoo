package sdvClass2024.Banque.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name ="virement")
public class Virement extends Operation{

    @Column(name = "beneficiaire")
    private String beneficiaire;

    public Virement() {
    }

    public Virement(LocalDateTime date, Double montant, String motif, String beneficiaire) {
        super(date, montant, motif);
        this.beneficiaire = beneficiaire;
    }
}

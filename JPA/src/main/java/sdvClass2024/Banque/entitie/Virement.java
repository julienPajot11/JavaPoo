package sdvClass2024.Banque.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name ="virement")
public class Virement extends Operation{

    @Column(name = "beneficiaire")
    private String beneficiaire;
}

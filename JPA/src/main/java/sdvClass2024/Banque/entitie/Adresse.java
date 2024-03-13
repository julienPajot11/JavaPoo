package sdvClass2024.Banque.entitie;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class Adresse implements Serializable {
        @Column(name = "NUMERO")
        private Integer numero;
        @Column(name = "RUE")
        private String rue;
        @Column(name = "CODEPOSTAL")
        public String codePostal;
        @Column(name = "VILLE")
        private String ville;

}

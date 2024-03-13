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
        private String codePostal;
        @Column(name = "VILLE")
        private String ville;

        public Adresse() {

        }

        public Adresse(Integer numero, String rue, String codePostal, String ville) {
                this.numero = numero;
                this.rue = rue;
                this.codePostal = codePostal;
                this.ville = ville;
        }
}



package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;

    @Column(name="DATE_NAISSANCE")
    private LocalDateTime dateNaissance;

    @Embedded
    private Adresse adresse;

    @ManyToOne
    @JoinColumn(name="BANQUE_ID")
    private Banque banque;

    @ManyToMany(mappedBy="clients" , cascade = CascadeType.ALL )
    private Set<Compte> comptes = new HashSet<>();

    public Client() {
    }

    public Client(String nom, String prenom, LocalDateTime dateNaissance, Adresse adresse, Banque banque) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.banque = banque;
    }

    public void setComptes(Set<Compte> comptes) {
        this.comptes = comptes;
    }

    public Set<Compte> getComptes() {
        return comptes;
    }
}



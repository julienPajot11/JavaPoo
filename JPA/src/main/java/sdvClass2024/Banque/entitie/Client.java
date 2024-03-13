package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
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

    @ManyToMany(mappedBy="clients")
    private Set<Compte> comptes;


}



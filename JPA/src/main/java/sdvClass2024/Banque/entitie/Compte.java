package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "SOLDE")
    private Double solde;

    @OneToMany(mappedBy="compte")
    private Set<Operation> operations;

    @ManyToMany
    @JoinTable(name="COMPTE_COLONNE",
            joinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName=
                    "ID"),
            inverseJoinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID")
    )
    private Set<Client> clients;



}

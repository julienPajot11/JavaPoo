package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name = "NUMERO")
    private String numero;

    @Column(name = "SOLDE")
    private Double solde;

    @OneToMany(mappedBy="compte" , cascade = CascadeType.ALL)
    private Set<Operation> operations = new HashSet<>();

    @ManyToMany
    @JoinTable(name="COMPTE_CLIENT",
            joinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName=
                    "ID"),
            inverseJoinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID")
    )
    private Set<Client> clients = new HashSet<>();

    public Compte() {
    }

    public Compte( String numero, Double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void addClient(Client client){
        clients.add(client);
        client.getComptes().add(this);
    }

    public void addOperations(Operation ope){
        operations.add(ope);
        ope.setCompte(this);

    }



}

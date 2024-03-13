package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name ="operation")
public abstract class Operation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="DATE")
    private LocalDateTime date;

    @Column(name = "MONTANT")
    private Double montant;

    @Column(name = "MOTIF")
    private String motif;

    @ManyToOne
    @JoinColumn(name="COMPTE_ID")
    private Compte compte;
}

package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "assurancevie")
public class AssuranceVie extends Compte{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;


    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @Column(name="TAUX")
    private Double taux;

}

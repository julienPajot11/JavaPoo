package sdvClass2024.Banque.entitie;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name ="banque")
public class Banque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name = "NOM")
    private String nom;

    @OneToMany(mappedBy="banque")
    private Set<Client> clients;




}

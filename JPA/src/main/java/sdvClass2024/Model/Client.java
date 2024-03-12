package sdvClass2024.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;

    @OneToMany(mappedBy="client")
    private Set<Emprunt> emprunt;

    public Client() {
    }

    public Client(String nom, String prenom, Set<Emprunt> emprunt) {
        this.nom = nom;
        this.prenom = prenom;
        this.emprunt = emprunt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Set<Emprunt> getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(Set<Emprunt> emprunt) {
        this.emprunt = emprunt;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

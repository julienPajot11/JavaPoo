package sdvClass2024.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="livre")
public class Livre implements Serializable {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="TITRE")
    private String titre;
    @Column(name="AUTEUR")
    private String auteur;

    @ManyToMany
    @JoinTable(name="COMPO",
            joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName=
                    "ID"),
            inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID")
    )
    private Set<Emprunt> emprunts;


    public Livre() {
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livre livre = (Livre) o;
        return Objects.equals(id, livre.id) && Objects.equals(titre, livre.titre) && Objects.equals(auteur, livre.auteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titre, auteur);
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}

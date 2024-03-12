package sdvClass2024.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="emprunt")
public class Emprunt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="DATE_DEBUT")
    private LocalDateTime dateDebut;

    @Column(name="DATE_FIN ")
    private LocalDateTime dateFin;

    @Column(name="DELAI ")
    private Integer delai;

    @ManyToOne
    @JoinColumn(name="ID_CLIENT")
    private Client client;

    @ManyToMany(mappedBy="emprunts")
    private Set<Livre> livres;

    public Emprunt() {
    }

    public Emprunt(LocalDateTime dateDebut, LocalDateTime dateFin, Integer delai, Client client, Set<Livre> livres) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.delai = delai;
        this.client = client;
        this.livres = livres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }

    public Integer getDelai() {
        return delai;
    }

    public void setDelai(Integer delai) {
        this.delai = delai;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres(Set<Livre> livres) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "id=" + id +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", delai=" + delai +
                ", client=" + client +
                ", livres=" + livres +
                '}';
    }
}

package sdvClass2024;

import jakarta.persistence.*;
import sdvClass2024.Model.Livre;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager em = entityManagerFactory.createEntityManager();
        // R of CRUD
        EntityTransaction et = em.getTransaction();
        et.begin();
            Livre getLivre = em.find(Livre.class, 1);
            if (getLivre != null){
                System.out.println(getLivre);
            }

        // C of CRUD
        /*Livre newlivre = new Livre("3 petits cochon","le grand méchant loup");
            em.persist(newlivre);*/

        // U of CRUD
        Livre livre = em.find(Livre.class, 6);
        if (livre != null){
            livre.setAuteur("Cendrillon");
        }
        //D of Delete
        Livre removeLivre = em.find(Livre.class, 7);
        if (removeLivre != null){
            em.remove(removeLivre);
        }

        // R of CRUD pour avoir la liste des livres
        Query query2 = em.createQuery("select l from Livre l");
            System.out.println(query2.getResultList().toString());
        et.commit();
        em.close();
        entityManagerFactory.close();
        em.close();
    }
}
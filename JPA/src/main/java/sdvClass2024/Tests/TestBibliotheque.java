package sdvClass2024.Tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import sdvClass2024.Model.Client;
import sdvClass2024.Model.Emprunt;
import sdvClass2024.Model.Livre;

public class TestBibliotheque {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        System.out.println("L'emprunt : avec la liste de livre ");
        System.out.println("----------------------------------------------- ");
        Emprunt getEmprunt= em.find(Emprunt.class, 1);
        if (getEmprunt != null){
            System.out.println(getEmprunt.getLivres());
        }

        System.out.println("----------------------------------------------- ");
        System.out.println("Le client : avec la liste d'emprunt ");
        System.out.println("----------------------------------------------- ");
        Client getClient= em.find(Client.class, 1);
        if (getClient != null){
            System.out.println(getClient.getEmprunt());
        }
        System.out.println("----------------------------------------------- ");
        et.commit();
        em.close();
        entityManagerFactory.close();
        em.close();
    }
}

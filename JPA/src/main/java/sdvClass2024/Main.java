package sdvClass2024;

import jakarta.persistence.*;
import sdvClass2024.Banque.entitie.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
        EntityManager em = entityManagerFactory.createEntityManager();

        // R of CRUD
        /*
            Livre getLivre = em.find(Livre.class, 1);
            if (getLivre != null){
                System.out.println(getLivre);
            }*/
        EntityTransaction et = em.getTransaction();
        et.begin();
        // C of CRUD


        Banque banque1 = new Banque("Boursorama");

        Adresse adresse1 = new Adresse(14,"labas","44100","nantes");
        Client client1 = new Client("julien","pajot", LocalDateTime.now(),adresse1,banque1);
        Client client2 = new Client("galad","dossantos", LocalDateTime.now(),adresse1,banque1);
        Client client3 = new Client("Loucas","tougeron", LocalDateTime.now(),adresse1,banque1);

        Set<Client> clients = new HashSet<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);


        Compte compteNormal= new Compte("58746923B",150000.5);

        LivretA livreta = new LivretA("7895482B", 7500.5, 3.0);
        AssuranceVie assurancevie = new AssuranceVie("5986243C", 10000.0, LocalDate.now(),5.0 );

        Operation operation1 = new Operation(LocalDateTime.now(),50.0,"courses");
        Virement virement1 = new Virement(LocalDateTime.now(),50.0,"gt86","garage");

        compteNormal.addOperations(operation1);
        compteNormal.addOperations(virement1);

        compteNormal.addClient(client1);
        compteNormal.addClient(client2);
        livreta.addClient(client3);
        assurancevie.addClient(client3);
        banque1.setClients(clients);
        em.persist(banque1);


        // U of CRUD
        /*Livre livre = em.find(Livre.class, 6);
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
*/
        et.commit();
        em.close();
        entityManagerFactory.close();

    }
}
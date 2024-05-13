package ga.chopin;

import ga.chopin.dao.Produit;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.sql.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();) {

            //démarage de la transaction

            Produit p = new Produit("le lait nido", "10127l");
            entityManager.getTransaction().begin();


            try {
                /* persistance
                    entityManager.persist(p);
                   entityManager.getTransaction().commit();

                 */
            } catch (Exception e) {
                entityManager.getTransaction().rollback();
                e.printStackTrace();
            }
        }
    }
}
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
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo_chopin");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /* créattion de la transaction */
         EntityTransaction transaction = entityManager.getTransaction();

        //démarage de la transaction

        Produit p = new Produit("savon", "1205c");
        transaction.begin();


        try {
            entityManager.persist(p);
            transaction.commit();
        } catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        }
    }
}
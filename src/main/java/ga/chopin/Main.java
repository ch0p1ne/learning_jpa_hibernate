package ga.chopin;

import ga.chopin.dao.Produit;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        try (EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager()) {

            //démarage de la transaction

//            Produit p = new Produit("le lait nido", "10127l");
//            Produit demo = null;


            try {
                /* persistance
                    entityManager.persist(p);
                   entityManager.getTransaction().commit();


                   public UserEntity getUserByIdWithPlainQuery(Long id) {
                    Query jpqlQuery = getEntityManager().createQuery("SELECT u FROM UserEntity u WHERE u.id=:id");
                    jpqlQuery.setParameter("id", id);
                    return (UserEntity) jpqlQuery.getSingleResult();
}

                 */

                /* initialisation d'un object par recherche en base  de donner d'un entityManager */
//                demo = entityManager.find(Produit.class, 4);
//                System.out.println(demo);
                List<Produit> produits = entityManager.createQuery("select p from Produit p", Produit.class).getResultList();
                for (Produit produit : produits) {
                    System.out.println(produit);
                }

            } catch (Exception e) {
                entityManager.getTransaction().rollback();
                e.printStackTrace();
            }
        }
    }
}
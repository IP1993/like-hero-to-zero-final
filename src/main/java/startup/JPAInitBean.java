package startup;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Singleton
@Startup
public class JPAInitBean {

    @PersistenceContext(unitName = "heroPU")
    private EntityManager em;

    @PostConstruct
    private void init() {
        try {
            // Force JPA to initialize by running a valid JPQL query
            em.createQuery("SELECT u FROM User u")
                    .setMaxResults(1)
                    .getResultList();

            System.out.println(">>> JPA initialized successfully");
        } catch (Exception e) {
            System.out.println(">>> JPA init failed: " + e.getMessage());
        }
    }
}

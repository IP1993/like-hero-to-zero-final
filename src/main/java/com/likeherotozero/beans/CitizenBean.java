package beans;

import entities.Emission;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Named
@RequestScoped
public class CitizenBean {

    @PersistenceContext(unitName = "heroPU")
    private EntityManager em;

    public List<Emission> getAllEmissions() {
        return em.createQuery("SELECT e FROM Emission e", Emission.class)
                .getResultList();
    }
}

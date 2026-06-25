package beans;

import entities.Country;
import entities.Emission;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;

@Named
@RequestScoped
public class ScientistBean {

    @PersistenceContext(unitName = "heroPU")
    private EntityManager em;

    private Long countryId;
    private int year;
    private double co2;

    @Transactional
    public String addEntry() {

        Country c = em.find(Country.class, countryId);

        Emission e = new Emission();
        e.setCountry(c);
        e.setYear(year);
        e.setCo2(co2);

        em.persist(e);

        return "scientist.xhtml?faces-redirect=true";
    }

    public List<Emission> getAllEmissions() {
        return em.createQuery("SELECT e FROM Emission e", Emission.class)
                .getResultList();
    }

    public List<Country> getAllCountries() {
        return em.createQuery("SELECT c FROM Country c", Country.class)
                .getResultList();
    }

    // getters + setters
    public Long getCountryId() { return countryId; }
    public void setCountryId(Long id) { this.countryId = id; }

    public int getYear() { return year; }
    public void setYear(int y) { this.year = y; }

    public double getCo2() { return co2; }
    public void setCo2(double c) { this.co2 = c; }
}

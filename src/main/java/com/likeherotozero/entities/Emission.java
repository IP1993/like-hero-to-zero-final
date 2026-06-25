package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "emissions")
public class Emission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private double co2;

    public Emission() {}

    public Emission(Country country, int year, double co2) {
        this.country = country;
        this.year = year;
        this.co2 = co2;
    }

    // Getters and setters
    public Long getId() { return id; }
    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public double getCo2() { return co2; }
    public void setCo2(double co2) { this.co2 = co2; }
}

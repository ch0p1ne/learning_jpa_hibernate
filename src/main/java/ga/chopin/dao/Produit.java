package ga.chopin.dao;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "produits")
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "designation", nullable = false, length = 75)
    private String designation;
    @Column(nullable = false, length = 25)
    private String code;

    @Column(name = "dateArr")
    private Date dateArriver;
    public Produit() {
        // TODO.MD
        //
        //  it's for after
    }

    public Produit(String designation, String code, Date dateArriver) {
        this.designation = designation;
        this.code = code;
        this.dateArriver = dateArriver;
    }
    public Produit(String designation, String code) {
        this.designation = designation;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public String getCode() {
        return code;
    }

    public Date getDateArriver() {
        return dateArriver;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", code='" + code + '\'' +
                ", dateArriver=" + dateArriver +
                '}';
    }
}

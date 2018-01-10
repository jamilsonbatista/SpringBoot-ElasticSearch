package elastic.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "CITY")
public class City implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private  String id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNTRY_ID", nullable = false)
    private String countryId;
/*
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID", nullable = false)
    private  Country country;

    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

  /*  public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
    */
}

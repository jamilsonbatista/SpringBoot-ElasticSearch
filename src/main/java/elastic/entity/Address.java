package elastic.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable{

    @Id
    @GeneratedValue()
    @Column(name = "ID")
    private String id;

    @Column(name = "COUNTRY_ID", nullable = false)
    private String countryId;

    @Column(name = "USER_ID", nullable = false)
    private String userId;

   /* @JsonIgnore
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
    */

    @Column(name = "CITY_ID", nullable = false)
    private String cityId;
/*
    @JsonIgnore
    @JoinColumn(name = "CITY_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    */
    @Column(name = "TOWN_ID", nullable = false)
    private String townId;

  /*  @JsonIgnore
    @JoinColumn(name = "TOWN_ID", referencedColumnName = "ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Town town;
*/
    @Column(name = "APT_NAME", nullable = false)
    private String apartment; //APT_NAME

    @Column(name = "APT_NO", nullable = false)
    private String apartmentNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }/*

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
*/
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }
/*
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    */

    public String getTownId() {
        return townId;
    }

    public void setTownId(String townId) {
        this.townId = townId;
    }

  /*  public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
*/
    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }
}

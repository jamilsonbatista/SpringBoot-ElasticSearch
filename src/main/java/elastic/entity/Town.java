package elastic.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "TOWN")
public class Town implements Serializable {

    @Id
    @Column(name = "ID", nullable = false)
    private String id;


    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "CITY_ID")
    private String cityId;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID", referencedColumnName = "ID", nullable = false, updatable = false)
    private City city;

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

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

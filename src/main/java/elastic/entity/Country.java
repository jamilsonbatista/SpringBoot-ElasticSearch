package elastic.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "COUNTRY")
public class Country implements Serializable {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME", nullable = false)
    private String name;

 /*   @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID", referencedColumnName = "ID", nullable = false)
    private  City city;
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

 /*   public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    */
}

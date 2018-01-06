package elastic.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "CITY")
public class City {

    @Id
    @Column(name = "ID", nullable = false)
    private  String id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNTRY_ID", nullable = false)
    private String countryId;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID", nullable = false)
    private  Country country;


}

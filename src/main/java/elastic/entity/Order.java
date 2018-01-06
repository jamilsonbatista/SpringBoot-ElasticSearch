package elastic.entity;

import javax.persistence.*;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private User user ;



}

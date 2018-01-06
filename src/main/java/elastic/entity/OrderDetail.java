package elastic.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetail implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne()
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private Order order;

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "QUANTITY")
    private String quantity;

}

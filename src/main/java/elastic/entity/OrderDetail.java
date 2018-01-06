package elastic.entity;

import javax.persistence.*;

/**
 * Created by Mehmet Ali Sahinogullari on 06-Jan-18.
 */
@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne()
    @JoinColumn(name ="ORDER_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private Order order;

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "QUANTITY")
    private String quantity;

}

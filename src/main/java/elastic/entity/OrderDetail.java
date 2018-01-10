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

    @Column(name = "ORDER_ID")
    private  String orderId;

   /* @ManyToOne()
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private Order order;

    */

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "QUANTITY")
    private String quantity;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}

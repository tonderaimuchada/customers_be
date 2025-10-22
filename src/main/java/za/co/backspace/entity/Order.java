package za.co.backspace.entity;

import jakarta.persistence.*;

/**
 * @author Tonderai Muchada on 20/10/2025 - 10:30 AM
 */
@Entity
@Table(
        name = "order",
        uniqueConstraints = @UniqueConstraint(columnNames = {"orderReferenceNumber"})
)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private String orderReferenceNumber;
    private Integer customerId;
    private Integer productId;
    private Integer quantity;

    public Integer getOrderId() {
        return orderId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setOrderReferenceNumber(String orderReferenceNumber) {
        this.orderReferenceNumber = orderReferenceNumber;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}

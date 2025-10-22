package za.co.backspace.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

/**
 * @author Tonderai Muchada on 20/10/2025 - 11:21 AM
 */
@Entity
@Table(
        name = "product",
        uniqueConstraints = @UniqueConstraint(columnNames = {"name"})
)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private String price;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}

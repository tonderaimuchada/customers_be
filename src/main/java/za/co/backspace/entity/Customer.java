package za.co.backspace.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 10:14 AM
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    @NonNull
    private String name;
    @NonNull
    private String surname;
    @NonNull
    private String phoneNr;
    @NonNull
    private String email;
    @NonNull
    private List<Order> ordersList = new ArrayList<>();

    public Integer getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public String getEmail() {
        return email;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }
}

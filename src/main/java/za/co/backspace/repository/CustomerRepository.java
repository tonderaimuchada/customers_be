package za.co.backspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.backspace.entity.Customer;

/**
 * @author Tonderai Muchada on 20/10/2025 - 11:45 AM
 */
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}

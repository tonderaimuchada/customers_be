package za.co.backspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.backspace.entity.Customer;

/**
 * @author Tonderai Muchada on 20/10/2025 - 11:47 AM
 */
public interface OderRepository extends JpaRepository<Customer,Integer> {
}

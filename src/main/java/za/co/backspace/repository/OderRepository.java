package za.co.backspace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.backspace.entity.Order;

import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 11:47 AM
 */
public interface OderRepository extends JpaRepository<Order,Integer> {
    List<Order> findByCustomerId(Integer customerId);
}

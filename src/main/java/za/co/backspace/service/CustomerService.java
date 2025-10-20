package za.co.backspace.service;

import org.springframework.stereotype.Service;
import za.co.backspace.entity.Customer;
import za.co.backspace.entity.Order;
import za.co.backspace.repository.CustomerRepository;
import za.co.backspace.repository.OderRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

/**
 * @author Tonderai Muchada on 20/10/2025 - 11:39 AM
 */
@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    private OderRepository orderRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer addCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Customer customer)
    {
        if(customerRepository.findById(customer.getCustomerId()).isPresent())
            return customerRepository.save(customer);
        else
            throw new RuntimeException("Customer not found");
    }

    public void deleteCustomer(Customer customer)
    {
        customerRepository.delete(customer);
    }

    public List<Order> getOrdersForCustomer(Integer customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public Order addOrder(Order order, Integer customerId) {
        order.setCustomerId(customerId);
        String orderReference = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + "-" +
                String.format("%04d", new Random().nextInt(10000));
        order.setOrderReferenceNumber(orderReference);
        return orderRepository.save(order);
    }

    public Order updateOrder(Order order, Integer orderId) {
        order.setOrderId(orderId);
        return orderRepository.save(order);
    }

    public void deleteOrder(Integer orderId)
    {
        orderRepository.deleteById(orderId);
    }
}

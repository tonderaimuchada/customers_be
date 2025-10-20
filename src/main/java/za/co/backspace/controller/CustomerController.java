package za.co.backspace.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;
import za.co.backspace.entity.Customer;
import za.co.backspace.entity.Order;

import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 9:09 AM
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @GetMapping
    public List<Customer> getCustomers(){
        return null;
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return null;
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return null;
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer){}

    @GetMapping
    public List<Order> getOrdersForCustomer(@RequestBody Customer customer){
        return null;
    }

    @PostMapping
    public Order addOrder(@RequestBody Order order, Integer customerId){
        return null;
    }

    @PutMapping
    public Order updateOrder(@RequestBody Order order){
        return null;
    }

    @DeleteMapping
    public void deleteOrder(@RequestBody Order order){}
}

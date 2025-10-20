package za.co.backspace.controller;

import jakarta.annotation.PostConstruct;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import za.co.backspace.entity.Customer;
import za.co.backspace.entity.Order;
import za.co.backspace.service.CustomerService;

import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 9:09 AM
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }

    @PostMapping
    public Customer addCustomer(@NonNull @RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@NonNull @RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@NonNull @RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }

    @GetMapping
    public List<Order> getOrdersForCustomer(@NonNull @RequestBody Customer customer){
        return customerService.getOrdersForCustomer(customer.getCustomerId());
    }

    @PostMapping
    public Order addOrder(@NonNull @RequestBody Order order, Integer customerId){
        return customerService.addOrder(order, customerId);
    }

    @PutMapping
    public Order updateOrder(@NonNull @RequestBody Order order){
        return customerService.updateOrder(order, order.getOrderId());
    }

    @DeleteMapping
    public void deleteOrder(@NonNull @RequestBody Order order){
        customerService.deleteOrder(order.getOrderId());
    }
}

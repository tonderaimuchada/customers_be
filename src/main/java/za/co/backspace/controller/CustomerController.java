package za.co.backspace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
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
    @Autowired
    private CustomerService customerService;

    @GetMapping
    @PreAuthorize("hasAnyRole('administrator', 'customer')")
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }

    @PostMapping
    @PreAuthorize("hasRole('customer')")
    public Customer addCustomer(@Validated @RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@Validated @RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@Validated @RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }

    @GetMapping
    @PreAuthorize("hasAnyRole('administrator', 'customer')")
    public List<Order> getOrdersForCustomer(@Validated @RequestBody Customer customer){
        return customerService.getOrdersForCustomer(customer.getCustomerId());
    }

    @PostMapping
    @PreAuthorize("hasRole('customer')")
    public Order addOrder(@Validated @RequestBody Order order, Integer customerId){
        return customerService.addOrder(order, customerId);
    }

    @PutMapping
    @PreAuthorize("hasRole('customer')")
    public Order updateOrder(@Validated @RequestBody Order order){
        return customerService.updateOrder(order, order.getOrderId());
    }

    @DeleteMapping
    public void deleteOrder(@Validated @RequestBody Order order){
        customerService.deleteOrder(order.getOrderId());
    }
}

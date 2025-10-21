package za.co.backspace.controller;

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
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers(){
        return customerService.findAll();
    }

    @PostMapping
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
    public List<Order> getOrdersForCustomer(@Validated @RequestBody Customer customer){
        return customerService.getOrdersForCustomer(customer.getCustomerId());
    }

    @PostMapping
    public Order addOrder(@Validated @RequestBody Order order, Integer customerId){
        return customerService.addOrder(order, customerId);
    }

    @PutMapping
    public Order updateOrder(@Validated @RequestBody Order order){
        return customerService.updateOrder(order, order.getOrderId());
    }

    @DeleteMapping
    public void deleteOrder(@Validated @RequestBody Order order){
        customerService.deleteOrder(order.getOrderId());
    }
}

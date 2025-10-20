package za.co.backspace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.backspace.entity.Customer;

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
}

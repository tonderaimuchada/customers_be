package za.co.backspace.controller;

import org.springframework.web.bind.annotation.*;
import za.co.backspace.entity.Product;

import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 9:56 AM
 */
@RestController
public class ProductController {
    @GetMapping
    public List<Product> getProducts(){
        return null;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return null;
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return null;
    }

    @DeleteMapping
    public void deleteProduct(@RequestBody Product product){}
}

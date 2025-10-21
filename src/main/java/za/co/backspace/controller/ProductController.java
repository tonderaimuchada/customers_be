package za.co.backspace.controller;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import za.co.backspace.entity.Product;
import za.co.backspace.service.ProductService;

import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 9:56 AM
 */
@RestController
public class ProductController {
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productService.findAll();
    }

    @PostMapping
    public Product addProduct(@Validated @RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping
    public Product updateProduct(@Validated @RequestBody Product product){
        return productService.updateProduct(product.getProductId(), product);
    }

    @DeleteMapping
    public void deleteProduct(@Validated @RequestBody Product product){
        productService.deleteProduct(product.getProductId());
    }
}

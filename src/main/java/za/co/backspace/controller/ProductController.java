package za.co.backspace.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import za.co.backspace.entity.Product;
import za.co.backspace.service.ProductService;

import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 9:56 AM
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    @PreAuthorize("hasAnyRole('administrator', 'customer')")
    public List<Product> getProducts(){
        return productService.findAll();
    }

    @PostMapping
    @PreAuthorize("hasRole('administrator')")
    public Product addProduct(@Validated @RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping
    @PreAuthorize("hasRole('administrator')")
    public Product updateProduct(@Validated @RequestBody Product product){
        return productService.updateProduct(product.getProductId(), product);
    }

    @DeleteMapping
    @PreAuthorize("hasRole('administrator')")
    public void deleteProduct(@Validated @RequestBody Product product){
        productService.deleteProduct(product.getProductId());
    }
}

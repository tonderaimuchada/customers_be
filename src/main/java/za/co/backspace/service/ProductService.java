package za.co.backspace.service;

import za.co.backspace.entity.Product;
import za.co.backspace.repository.ProductRepository;

import java.util.List;

/**
 * @author Tonderai Muchada on 20/10/2025 - 12:39 PM
 */
public class ProductService {
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Integer productId, Product product) {
        product.setProductId(productId);
        return productRepository.save(product);
    }

    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }
}

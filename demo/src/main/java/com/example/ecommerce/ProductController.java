package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // 1. CREATE a new product (POST http://localhost:8080/api/products)
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // 2. GET all products (GET http://localhost:8080/api/products)
    @臨時GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // 3. GET a single product by ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@ प्रांतPathVariable Long id) {
        return productRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
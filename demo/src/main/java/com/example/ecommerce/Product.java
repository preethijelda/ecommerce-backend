package com.example.ecommerce.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data // Automatically creates getters, setters, and toString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
}
package com.example.inventorymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.inventorymanagement.entity.Product;

public interface ProductRepository
        extends JpaRepository<Product, Long> {

}

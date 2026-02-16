package com.example.JwtDemo.Repository;

import com.example.JwtDemo.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

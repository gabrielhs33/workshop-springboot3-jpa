package com.gabriel.workshopspringboot3jpa.repositories;

import com.gabriel.workshopspringboot3jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    
}

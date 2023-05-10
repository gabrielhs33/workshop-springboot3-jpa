package com.gabriel.workshopspringboot3jpa.repositories;

import com.gabriel.workshopspringboot3jpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    
}

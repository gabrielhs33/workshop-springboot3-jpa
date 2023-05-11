package com.gabriel.workshopspringboot3jpa.services;

import com.gabriel.workshopspringboot3jpa.entities.Product;
import com.gabriel.workshopspringboot3jpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){

        return repository.findAll();
    }

    public Product findByID(Long id){

        Optional<Product> obj = repository.findById(id);

        return obj.get();
    }
}
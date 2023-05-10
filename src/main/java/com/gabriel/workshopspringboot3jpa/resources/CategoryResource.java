package com.gabriel.workshopspringboot3jpa.resources;

import com.gabriel.workshopspringboot3jpa.entities.Category;
import com.gabriel.workshopspringboot3jpa.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    //end point to access Categorys
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){

        List<Category> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    //end point to search for a Category by id

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){

        Category obj = service.findByID(id);

        return ResponseEntity.ok().body(obj);
    }
}

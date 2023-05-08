package com.gabriel.workshopspringboot3jpa.resources;

import com.gabriel.workshopspringboot3jpa.entities.User;
import com.gabriel.workshopspringboot3jpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    //end point to access users
    @GetMapping
    public ResponseEntity<List<User>> findAll(){

        List<User> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    //end point to search for a user by id

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){

        User obj = service.findByID(id);

        return ResponseEntity.ok().body(obj);
    }
}

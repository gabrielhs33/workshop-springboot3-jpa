package com.gabriel.workshopspringboot3jpa.resources;

import com.gabriel.workshopspringboot3jpa.entities.User;
import com.gabriel.workshopspringboot3jpa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    //end point to insert a user
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj){

        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(obj);
    }
}

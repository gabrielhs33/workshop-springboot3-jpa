package com.gabriel.workshopspringboot3jpa.services;

import com.gabriel.workshopspringboot3jpa.entities.User;
import com.gabriel.workshopspringboot3jpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){

        return repository.findAll();
    }

    public User findByID(Long id){

        Optional<User> obj = repository.findById(id);

        return obj.get();
    }

    public User insert(User obj){

        return repository.save(obj);
    }

    public void delete(Long id){

        repository.deleteById(id);
    }
}
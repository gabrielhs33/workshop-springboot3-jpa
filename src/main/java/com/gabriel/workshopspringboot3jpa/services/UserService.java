package com.gabriel.workshopspringboot3jpa.services;

import com.gabriel.workshopspringboot3jpa.entities.User;
import com.gabriel.workshopspringboot3jpa.repositories.UserRepository;
import com.gabriel.workshopspringboot3jpa.services.exceptions.DataBaseException;
import com.gabriel.workshopspringboot3jpa.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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

        return obj.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert(User obj){

        return repository.save(obj);
    }

    public void delete(Long id){

        try {

            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){

            throw new ResourceNotFoundException(id);
        }catch(DataIntegrityViolationException e){

            throw new DataBaseException(e.getMessage());
        }
    }

    private void updateData(User entity, User obj){

        try{

            entity.setName(obj.getName());
            entity.setEmail(obj.getEmail());
            entity.setPhone(obj.getPhone());

        }catch (EntityNotFoundException e){

            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    public User update(Long id, User obj){

        User entity = repository.getReferenceById(id);
        updateData(entity,obj);
        return repository.save(entity);
    }
}
package com.gabriel.workshopspringboot3jpa.repositories;

import com.gabriel.workshopspringboot3jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}

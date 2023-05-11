package com.gabriel.workshopspringboot3jpa.repositories;

import com.gabriel.workshopspringboot3jpa.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}

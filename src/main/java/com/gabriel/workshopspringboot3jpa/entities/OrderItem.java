package com.gabriel.workshopspringboot3jpa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gabriel.workshopspringboot3jpa.entities.pk.OrderItemPK;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    @EmbeddedId
    private final OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private double price;

    public OrderItem(){}

    public OrderItem(Order order, Product product, Integer quantity, double price) {

        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @JsonIgnore
    public Order getOrder(){

        return id.getOrder();
    }

    public Product getProduct(){

        return id.getProduct();
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduct(Product product){

        id.setProduct(product);
    }

    public void setOrder(Order order) {

        id.setOrder(order);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

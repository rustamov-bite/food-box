package com.food_box.project.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "food_orders")
@Data
@Builder
public class FoodOrder extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "total_price")
    private double totalPrice;
}

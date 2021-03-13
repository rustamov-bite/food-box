package com.food_box.project.models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "foods")
@Data
@Builder
@RequiredArgsConstructor
public class Food extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "food_type_id")
    private FoodType foodType;
    @Column(name = "size")
    private double size;
    @Column(name = "price")
    private double price;
    @Column(name = "weight")
    private double weight;
    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;
    @Column(name = "is_active")
    private boolean isActive;

}

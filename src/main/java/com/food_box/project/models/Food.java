package com.food_box.project.models;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "foods")
@Data
@Builder
@RequiredArgsConstructor
public class Food extends BaseEntity {
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
    @Column(name = "isActive")
    private boolean isActive;

}

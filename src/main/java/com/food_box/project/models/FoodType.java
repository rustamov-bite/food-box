package com.food_box.project.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "food_types")
@Data
@Builder
public class FoodType extends BaseEntity {
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "foods")
    List<Food> foodList;
}

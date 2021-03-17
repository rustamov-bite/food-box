package com.food_box.project.repositories;

import com.food_box.project.models.FoodType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTypeRepository extends JpaRepository<FoodType,Long> {
}

package com.food_box.project.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "call_back")
public class CallBack extends BaseEntity {
    private String name;
    private String phone;
}

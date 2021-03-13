package com.food_box.project.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@Entity
@Table(name = "admins")
public class Admin extends BaseEntity {
    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "admin_password")
    private String password;
}

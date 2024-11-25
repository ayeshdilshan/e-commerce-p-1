package com.example.e_commerce_proj_1.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategory", nullable = false)
    private Integer id;

    @Column(name = "category_name", nullable = false)
    private  String name;

    @Column(name = "description", nullable = false)
    private  String description;
}

package com.example.e_commerce_proj_1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private int id;
    private  String name;
//    private  String desc;
    private  String brand;
    private BigDecimal price;
    private  String category;
    private Date releaseDate;
    private boolean available;
    private int quantity;
}
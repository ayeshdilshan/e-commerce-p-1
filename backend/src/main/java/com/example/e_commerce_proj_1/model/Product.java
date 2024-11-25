package com.example.e_commerce_proj_1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idproduct", nullable = false)
    private Integer id;

    @Column(name = "product_name", nullable = false)
    private  String name;

    @Column(name = "product_description", nullable = false)
    private  String description;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "id_category", nullable = false)
    private  Integer categoryId;

    @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-mm-yyyy")
    @Column(name = "release_date", nullable = false)
    private Date releaseDate;

    @Column(name = "product_availablity")
    private boolean available;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "image_type")
    private String imageType;

    @Lob
    @Column(name = "image_data", nullable = false)
    private byte[] imageData;
}

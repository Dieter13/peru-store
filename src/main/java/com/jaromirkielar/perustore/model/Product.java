package com.jaromirkielar.perustore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private Set<OrderDetails> orderDetails;

    private String productName;

    private String productDescription;

    private String photoLink;

    private String color;

    private Double price;

    private Double weight;

    private Double size;

    private Integer inStockAmount;

    private String productCategory;
    public Product(String productName, String productDescription, String photoLink,
                   String color, Double price, Integer inStockAmount, String productCategory){
        this.productName = productName;
        this.productDescription = productDescription;
        this.photoLink = photoLink;
        this.color = color;
        this.price = price;
        this.inStockAmount = inStockAmount;
        this.productCategory = productCategory;
    }


}


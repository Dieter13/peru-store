package com.jaromirkielar.perustore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class OrderDetails {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     @ManyToOne(fetch= FetchType.LAZY)
     @JoinColumn(name = "orders_id")
     private Orders orders;

     @ManyToOne(fetch= FetchType.LAZY)
     @JoinColumn(name = "product_id")
     private Product product;

     private String orderNumber;

     private Integer quantity;

     private Float price;

     private Float discount;

     private Float total;

//     private String IDSKU;

//     private String size;
//
//     private String color;

//     private boolean fullfilled;

//     private Date shipDate;
//
//     private Date billDate;


}

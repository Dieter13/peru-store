package com.jaromirkielar.perustore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="customer_id")
    private Customer customer;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="shipper_id")
    private Shipper shipper;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
    private Set<OrderDetails> orderDetails = new HashSet<>();

    private String orderNumber;

    private Date orderDate;

    private Date shipDate;

//    private Date requiredDate;
//
//    private Date paymentDate;

    private Timestamp timestamp;

//    private String Freight;
//
//    private String salesTax;

    private TransactionStatus transactionStatus;

    private boolean fullfilled;

    private boolean deleted;

    private boolean paid;

//    private String errorLoc;
//
//    private String errorMessage;





}

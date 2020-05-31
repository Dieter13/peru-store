package com.jaromirkielar.perustore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private Set<Orders> orders;

    public Customer(String firstName, String lastName, String email ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

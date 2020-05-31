package com.jaromirkielar.perustore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "payment")
    private Set<Orders> orders = new HashSet<>();

    private boolean allowed;


}

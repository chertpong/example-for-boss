package com.kritacademy.orders;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author krit <chertpong.github.io> on 5/13/2017.
 */
@Getter
@Setter
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "order")
    private Set<OrderItem> orderItems = new HashSet<>();
}

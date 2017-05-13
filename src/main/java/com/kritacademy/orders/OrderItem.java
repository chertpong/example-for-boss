package com.kritacademy.orders;

import com.kritacademy.products.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author krit <chertpong.github.io> on 5/13/2017.
 */
@Entity(name = "order_item")
@Getter
@Setter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Order order;

    @OneToMany
    private Set<Product> products = new HashSet<>();

    private Integer amount;
}

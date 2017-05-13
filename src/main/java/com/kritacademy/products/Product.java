package com.kritacademy.products;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

/**
 * @author krit <chertpong.github.io> on 5/13/2017.
 */
@Getter
@Setter
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;
}

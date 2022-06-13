package com.example.electronicShop.item.dao;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.manufacturer.dao.Manufacturer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Item {
    @Id
    @Column
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;
    @JsonIgnore
    @ManyToMany(mappedBy = "item")
    /*@JoinTable(
            name = "item_customer",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id"))*/
    private List<Customer> customer = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;
}
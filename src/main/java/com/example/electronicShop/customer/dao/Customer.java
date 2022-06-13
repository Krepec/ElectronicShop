package com.example.electronicShop.customer.dao;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.item.dao.Item;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;
    @JsonManagedReference
    @ManyToMany
    @JoinTable(
            name = "item_customer",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<Item> item = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "address_id")
    private Set<Address> address = new HashSet<>();





}

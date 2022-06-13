package com.example.electronicShop.manufacturer.dao;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.item.dao.Item;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@RequiredArgsConstructor
public class Manufacturer {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "address_id")
    private Set<Address> addresses = new HashSet<>();

    @OneToMany(mappedBy = "manufacturer")
    private Set<Item> items = new HashSet<>();


}
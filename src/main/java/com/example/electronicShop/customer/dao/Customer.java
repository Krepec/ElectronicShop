package com.example.electronicShop.customer.dao;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.item.dao.Item;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
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

    public Customer() {
    }

    public Customer(Long id, String name, String email, List<Item> item, Set<Address> address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.item = item;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }
}

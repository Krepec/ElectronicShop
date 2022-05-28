package com.example.ElectronicShop.Model;

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

    @ManyToMany
    @JoinTable(
            name = "item_customer",
            joinColumns = @JoinColumn(name = "cutomer_id"),
            inverseJoinColumns = @JoinColumn (name = "item_id"))
    private List<Item> items = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "address_id")
    private Set<Address> addresses = new HashSet<>();

    public Customer() {
    }

    public Customer(Long id, String name, String email, Set<Address> addresses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.addresses = addresses;
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

    public Set<Address> getaddresses() {
        return addresses;
    }

    public void setaddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

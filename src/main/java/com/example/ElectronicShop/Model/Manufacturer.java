package com.example.ElectronicShop.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
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

    public Manufacturer(Long id, String name, Set<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    public Manufacturer() {
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

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}

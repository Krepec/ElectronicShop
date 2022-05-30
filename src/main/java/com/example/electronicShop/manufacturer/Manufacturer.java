package com.example.electronicShop.manufacturer;

import com.example.electronicShop.address.AddressDAO;
import com.example.electronicShop.item.ItemDAO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Manufacturer {

    private Long id;

    private String name;

    private Set<AddressDAO> addressDAO = new HashSet<>();

    private Set<ItemDAO> itemDAO = new HashSet<>();

    public Manufacturer(Long id, String name, Set<AddressDAO> addressDAO) {
        this.id = id;
        this.name = name;
        this.addressDAO = addressDAO;
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

    public Set<AddressDAO> getAddresses() {
        return addressDAO;
    }

    public void setAddresses(Set<AddressDAO> addressDAOS) {
        this.addressDAO = addressDAOS;
    }
}

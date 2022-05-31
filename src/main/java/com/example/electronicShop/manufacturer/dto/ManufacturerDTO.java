package com.example.electronicShop.manufacturer.dto;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.item.dao.Item;

import java.util.HashSet;
import java.util.Set;

public class ManufacturerDTO {

    private Long id;

    private String name;

    private Set<Address> address = new HashSet<>();

    private Set<Item> item = new HashSet<>();

    public ManufacturerDTO(Long id, String name, Set<Address> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ManufacturerDTO() {
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
        return address;
    }

    public void setAddresses(Set<Address> addresses) {
        this.address = addresses;
    }
}

package com.example.electronicShop.customer.dto;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.item.dao.Item;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerDTO {

    private Long id;

    private String name;
    private String email;

    private List<Item> item = new ArrayList<>();
    private Set<Address> address = new HashSet<>();

    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String name, String email, List<Item> item, Set<Address> address) {
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

    public List<Item> getItemDAO() {
        return item;
    }

    public void setItemDAO(List<Item> item) {
        this.item = item;
    }

    public Set<Address> getAddressDAO() {
        return address;
    }

    public void setAddressDAO(Set<Address> address) {
        this.address = address;
    }
}
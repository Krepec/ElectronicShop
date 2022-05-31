package com.example.electronicShop.item.dao;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.manufacturer.dao.Manufacturer;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @Id
    @Column
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @ManyToMany
    @JoinTable(
            name = "item_customer",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "cutomer_id"))
    private List<Customer> customer = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Customer> getCustomerDAO() {
        return customer;
    }

    public void setCustomerDAO(List<Customer> customer) {
        this.customer = customer;
    }

    public Manufacturer getManufacturerDAO() {
        return manufacturer;
    }

    public void setManufacturerDAO(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Item(Long id, String name, Double price, List<Customer> customer, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.customer = customer;
        this.manufacturer = manufacturer;
    }

    public Item() {
    }
}

package com.example.electronicShop.item.dto;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.manufacturer.dao.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class ItemDTO {

    private Long id;

    private String name;

    private Double price;

    private List<Customer> customer = new ArrayList<>();

    private Manufacturer manufacturer;

    public ItemDTO() {
    }

    public ItemDTO(Long id, String name, Double price, List<Customer> customer, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.customer = customer;
        this.manufacturer = manufacturer;
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
}

package com.example.electronicShop.item;

import com.example.electronicShop.customer.CustomerDAO;
import com.example.electronicShop.manufacturer.ManufacturerDAO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Item {

    private Long id;

    private String name;

    private Double price;

    private List<CustomerDAO> customerDAO = new ArrayList<>();

    private ManufacturerDAO manufacturerDAO;

    public Item() {
    }

    public Item(Long id, String name, Double price, List<CustomerDAO> customerDAO, ManufacturerDAO manufacturerDAO) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.customerDAO = customerDAO;
        this.manufacturerDAO = manufacturerDAO;
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

    public List<CustomerDAO> getCustomerDAO() {
        return customerDAO;
    }

    public void setCustomerDAO(List<CustomerDAO> customerDAO) {
        this.customerDAO = customerDAO;
    }

    public ManufacturerDAO getManufacturerDAO() {
        return manufacturerDAO;
    }

    public void setManufacturerDAO(ManufacturerDAO manufacturerDAO) {
        this.manufacturerDAO = manufacturerDAO;
    }
}

package com.example.electronicShop.item;

import com.example.electronicShop.customer.CustomerDAO;
import com.example.electronicShop.manufacturer.ManufacturerDAO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ItemDAO {
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
    private List<CustomerDAO> customerDAO = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private ManufacturerDAO manufacturerDAO;

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

    public ItemDAO(Long id, String name, Double price, List<CustomerDAO> customerDAO, ManufacturerDAO manufacturerDAO) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.customerDAO = customerDAO;
        this.manufacturerDAO = manufacturerDAO;
    }

    public ItemDAO() {
    }
}

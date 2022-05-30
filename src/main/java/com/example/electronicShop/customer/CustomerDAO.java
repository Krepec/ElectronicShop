package com.example.electronicShop.customer;

import com.example.electronicShop.address.AddressDAO;
import com.example.electronicShop.item.ItemDAO;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class CustomerDAO {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "item_customer",
            joinColumns = @JoinColumn(name = "cutomer_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<ItemDAO> itemDAO = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "address_id")
    private Set<AddressDAO> addressDAO = new HashSet<>();

    public CustomerDAO() {
    }

    public CustomerDAO(Long id, String name, String email, List<ItemDAO> itemDAO, Set<AddressDAO> addressDAO) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.itemDAO = itemDAO;
        this.addressDAO = addressDAO;
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

    public List<ItemDAO> getItemDAO() {
        return itemDAO;
    }

    public void setItemDAOS(List<ItemDAO> itemDAO) {
        this.itemDAO = itemDAO;
    }

    public Set<AddressDAO> getAddressDAO() {
        return addressDAO;
    }

    public void setAddressDAO(Set<AddressDAO> addressDAO) {
        this.addressDAO = addressDAO;
    }
}
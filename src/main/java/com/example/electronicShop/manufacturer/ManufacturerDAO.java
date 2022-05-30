package com.example.electronicShop.manufacturer;

import com.example.electronicShop.address.AddressDAO;
import com.example.electronicShop.item.ItemDAO;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ManufacturerDAO {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "address_id")
    private Set<AddressDAO> addressDAOS = new HashSet<>();

    @OneToMany(mappedBy = "manufacturerDAO")
    private Set<ItemDAO> itemDAOS = new HashSet<>();
    public ManufacturerDAO(Long id, String name, Set<AddressDAO> addressDAOS) {
        this.id = id;
        this.name = name;
        this.addressDAOS = addressDAOS;
    }

    public ManufacturerDAO() {
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
        return addressDAOS;
    }

    public void setAddresses(Set<AddressDAO> addressDAOS) {
        this.addressDAOS = addressDAOS;
    }
}

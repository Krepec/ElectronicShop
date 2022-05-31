package com.example.electronicShop.address.dto;

public class AddressDTO {


    private Long id;

    private String country;
    private String city;
    private String street;
    private String building;
    private String flat;

    private Integer zipCode;

    public AddressDTO(Long id, String country, String city, String street, String building, String flat, Integer zipCode) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.flat = flat;
        this.zipCode = zipCode;
    }

    public AddressDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcountry() {
        return country;
    }

    public void setcountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
}

package com.example.electronicShop.item.dto;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.manufacturer.dao.Manufacturer;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
public class ItemDTO {

    private Long id;

    private String name;

    private Double price;

    private List<Customer> customer = new ArrayList<>();

    private Manufacturer manufacturer;
}
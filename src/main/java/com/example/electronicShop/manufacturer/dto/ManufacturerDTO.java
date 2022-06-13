package com.example.electronicShop.manufacturer.dto;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.item.dao.Item;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@RequiredArgsConstructor
public class ManufacturerDTO {

    private Long id;

    private String name;

    private Set<Address> address = new HashSet<>();

    private Set<Item> item = new HashSet<>();

}
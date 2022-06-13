package com.example.electronicShop.customer.dto;

import com.example.electronicShop.address.dao.Address;
import com.example.electronicShop.item.dao.Item;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class CustomerDTO {

    private Long id;

    private String name;
    private String email;

    private List<Item> item = new ArrayList<>();
    private Set<Address> address = new HashSet<>();
}


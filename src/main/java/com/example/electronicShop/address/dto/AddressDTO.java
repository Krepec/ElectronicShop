package com.example.electronicShop.address.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class AddressDTO {


    private Long id;

    private String country;
    private String city;
    private String street;
    private String building;
    private String flat;

    private Integer zipCode;

}
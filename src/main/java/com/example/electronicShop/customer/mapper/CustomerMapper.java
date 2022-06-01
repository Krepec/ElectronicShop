package com.example.electronicShop.customer.mapper;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.customer.dto.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDTO customertoCustormerDTO(Customer customer);
    Customer customerDTOtoCustormer(CustomerDTO customerDTO);
}

package com.example.electronicShop.customer;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.customer.dto.CustomerDTO;

public class CustomerMapper {


    private CustomerDTO mapCustomer(Customer customer){
        return new CustomerDTO(customer.getId(), customer.getName()
                , customer.getEmail(), customer.getItemDAO(), customer.getAddressDAO());
    }

    private Customer mapCustomer(CustomerDTO customerDTO){
        return new Customer(customerDTO.getId(), customerDTO.getName()
                , customerDTO.getEmail(), customerDTO.getItemDAO(), customerDTO.getAddressDAO());
    }
}

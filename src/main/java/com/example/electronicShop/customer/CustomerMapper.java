package com.example.electronicShop.customer;

public class CustomerMapper {


    private Customer mapCustomerDAO( CustomerDAO customerDAO){
        return new Customer(customerDAO.getId(), customerDAO.getName()
                ,customerDAO.getEmail(),customerDAO.getItemDAO(),customerDAO.getAddressDAO());
    }

    private CustomerDAO mapCustomerDAO( Customer customer){
        return new CustomerDAO(customer.getId(), customer.getName()
                ,customer.getEmail(),customer.getItemDAO(),customer.getAddressDAO());
    }
}

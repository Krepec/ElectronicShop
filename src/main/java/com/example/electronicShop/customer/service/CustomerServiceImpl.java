package com.example.electronicShop.customer.service;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.customer.dao.CustomerRepository;
import com.example.electronicShop.customer.dto.CustomerDTO;
import com.example.electronicShop.customer.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public String add(CustomerDTO customerDTO) {
        Customer customer = customerMapper.customerDTOtoCustormer(customerDTO);
        customerRepository.save(customer);
        return "Klient " + customer.getName() + " dodany";
    }

    @Override
    public Iterable<CustomerDTO> findAll() {
        return customerRepository
                .findAll()
                .stream()
                .map(customerMapper::customertoCustormerDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO findById(Long id) {
        return customerMapper.customertoCustormerDTO(customerRepository.findById(id).orElseThrow());

    }

    @Override
    public CustomerDTO findByEmail(String email) {
        Customer customer = customerRepository.findByEmail(email).orElseThrow();
        return customerMapper.customertoCustormerDTO;
    }
}

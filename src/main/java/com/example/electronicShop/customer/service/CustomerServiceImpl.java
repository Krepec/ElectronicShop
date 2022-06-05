package com.example.electronicShop.customer.service;

import com.example.electronicShop.customer.dao.Customer;
import com.example.electronicShop.customer.dao.CustomerRepository;
import com.example.electronicShop.customer.dto.CustomerDTO;
import com.example.electronicShop.customer.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
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
        List<CustomerDTO> list = customerRepository
                .findAll()
                .stream()
                .map(customerMapper::customertoCustormerDTO)
                .collect(Collectors.toList());
        return list;
    }

    @Override
    public CustomerDTO findById(Long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Customer with ID " + id + " not exist" ));
        return customerMapper.customertoCustormerDTO(customer);

    }

    @Override
    public CustomerDTO findByEmail(String email) {
        Customer customer = customerRepository.findByEmail(email).orElseThrow(() ->new EntityNotFoundException("Customer with ID " + email + " not exist" ));
        return customerMapper.customertoCustormerDTO(customer);
    }
}

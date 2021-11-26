package com.ar.customerservice.service;

import com.ar.customerservice.model.Customer;
import com.ar.customerservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer.convertToEntity()).convertToModel();
    }

    @Override
    public Customer getCustomer(Long customerId) {
        return customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("Customer Id Not Found")).convertToModel();
    }
}

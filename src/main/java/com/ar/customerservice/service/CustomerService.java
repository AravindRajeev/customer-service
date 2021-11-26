package com.ar.customerservice.service;

import com.ar.customerservice.entity.CustomerEntity;
import com.ar.customerservice.model.Customer;

public interface CustomerService {

    public Customer saveCustomer(Customer customer);
    public Customer getCustomer(Long customerId);
}

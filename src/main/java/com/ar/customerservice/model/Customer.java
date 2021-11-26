package com.ar.customerservice.model;

import com.ar.customerservice.entity.CustomerEntity;
import lombok.Data;

@Data
public class Customer {
    private Long customerId;

    private String customerName;
    private String phoneNumber;
    private Integer age;

    public CustomerEntity convertToEntity() {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerId(this.getCustomerId());
        customerEntity.setCustomerName(this.getCustomerName());
        customerEntity.setAge(this.getAge());
        customerEntity.setPhoneNumber(this.getPhoneNumber());
        return  customerEntity;
    }
}

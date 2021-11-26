package com.ar.customerservice.repository;

import com.ar.customerservice.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity,Long> {
}

package com.store.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.model.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
public Customer findByEmail(String email);
}

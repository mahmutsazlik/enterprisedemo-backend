package com.mahmutsazlik.enterprisedemo.repository;

import com.mahmutsazlik.enterprisedemo.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}

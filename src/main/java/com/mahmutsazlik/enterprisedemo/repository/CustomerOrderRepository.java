package com.mahmutsazlik.enterprisedemo.repository;

import com.mahmutsazlik.enterprisedemo.model.entity.CustomerOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrderEntity, Long> {
}

package com.mahmutsazlik.enterprisedemo.service.impl;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerDto;
import com.mahmutsazlik.enterprisedemo.model.entity.CustomerEntity;
import com.mahmutsazlik.enterprisedemo.model.mapper.CustomerMapper;
import com.mahmutsazlik.enterprisedemo.repository.CustomerRepository;
import com.mahmutsazlik.enterprisedemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
  private final CustomerRepository customerRepository;

  @Autowired
  public CustomerServiceImpl(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @Transactional
  @Override
  public CustomerDto createCustomer(CustomerDto customerDto) {
    final CustomerEntity entity = CustomerMapper.INSTANCE.toCustomerEntity(customerDto);
    customerRepository.save(entity);
    return  CustomerMapper.INSTANCE.toCustomerDto(entity);
  }

  @Transactional(readOnly = true)
  @Override
  public List<CustomerDto> customerDtoList() {
    final List<CustomerEntity> customerEntities = customerRepository.findAll();
    return CustomerMapper.INSTANCE.toCustomerDtoList(customerEntities);
  }
}

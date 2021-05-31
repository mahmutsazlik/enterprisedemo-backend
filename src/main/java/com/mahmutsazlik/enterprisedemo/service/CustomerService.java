package com.mahmutsazlik.enterprisedemo.service;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
  CustomerDto createCustomer(CustomerDto customerDto);
  List<CustomerDto> customerDtoList();

}

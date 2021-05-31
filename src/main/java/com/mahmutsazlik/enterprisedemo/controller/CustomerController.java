package com.mahmutsazlik.enterprisedemo.controller;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerDto;
import com.mahmutsazlik.enterprisedemo.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/customer")
@Api(tags = "Customer Information")
public class CustomerController {
  private final CustomerService customerService;

  @Autowired
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @ApiOperation(value = "Create Customer Operation")
  @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
    return new ResponseEntity<>(customerService.createCustomer(customerDto), HttpStatus.OK);
  }

  @ApiOperation(value = "All Customer List")
  @GetMapping(path = "/list")
  public ResponseEntity<List<CustomerDto>> customerDtoList() {
    return new ResponseEntity<>(customerService.customerDtoList(), HttpStatus.OK);
  }
}
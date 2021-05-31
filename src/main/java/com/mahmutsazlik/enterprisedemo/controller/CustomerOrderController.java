package com.mahmutsazlik.enterprisedemo.controller;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerDto;
import com.mahmutsazlik.enterprisedemo.model.dto.CustomerOrderDto;
import com.mahmutsazlik.enterprisedemo.model.request.CustomerOrderRequest;
import com.mahmutsazlik.enterprisedemo.model.response.CustomerOrderResponse;
import com.mahmutsazlik.enterprisedemo.service.CustomerOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/order")
@Api(tags = "Customer order information")
@Slf4j
public class CustomerOrderController {

  private final CustomerOrderService customerOrderService;

  @Autowired
  public CustomerOrderController(CustomerOrderService customerOrderService) {
    this.customerOrderService = customerOrderService;
  }

  @ApiOperation(value = "Create Customer Order Operation")
  @PostMapping(path = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CustomerOrderResponse> createCustomerOrder(@RequestBody CustomerOrderRequest request) {
    if (request.getCustomerOrderId().equals(1L))
      log.debug("Requesten gelen degeri gor: " + request.getCustomerOrderId());

    return new ResponseEntity<>(customerOrderService.createCustomerOrders(request), HttpStatus.OK);
  }
}

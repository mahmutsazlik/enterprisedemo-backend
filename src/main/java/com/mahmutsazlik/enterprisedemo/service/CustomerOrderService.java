package com.mahmutsazlik.enterprisedemo.service;

import com.mahmutsazlik.enterprisedemo.model.request.CustomerOrderRequest;
import com.mahmutsazlik.enterprisedemo.model.response.CustomerOrderResponse;

public interface CustomerOrderService {

  CustomerOrderResponse createCustomerOrders(CustomerOrderRequest request);
}

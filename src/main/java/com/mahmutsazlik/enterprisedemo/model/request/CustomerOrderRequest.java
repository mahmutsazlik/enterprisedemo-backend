package com.mahmutsazlik.enterprisedemo.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CustomerOrderRequest {
  private Long customerOrderId;
  private Long customerId;
  private List<Long> productIds;
}

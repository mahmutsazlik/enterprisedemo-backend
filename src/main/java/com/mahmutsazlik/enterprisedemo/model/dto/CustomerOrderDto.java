package com.mahmutsazlik.enterprisedemo.model.dto;

import com.mahmutsazlik.enterprisedemo.model.dto.base.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerOrderDto extends BaseDto {
  private Long customerOrderId;
  private Long customerId;
  private Long productId;
}

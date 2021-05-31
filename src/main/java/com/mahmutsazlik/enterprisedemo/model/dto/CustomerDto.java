package com.mahmutsazlik.enterprisedemo.model.dto;

import com.mahmutsazlik.enterprisedemo.model.dto.base.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto extends BaseDto {
  private Long customerId;
  private String customerName;
  private String customerSurname;
}

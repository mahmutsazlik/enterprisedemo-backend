package com.mahmutsazlik.enterprisedemo.model.response;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerOrderDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOrderResponse {
  private List<CustomerOrderDto> customerOrderDtos;
}

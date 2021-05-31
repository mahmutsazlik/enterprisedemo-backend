package com.mahmutsazlik.enterprisedemo.service.impl;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerOrderDto;
import com.mahmutsazlik.enterprisedemo.model.entity.CustomerOrderEntity;
import com.mahmutsazlik.enterprisedemo.model.mapper.CustomerOrderMapper;
import com.mahmutsazlik.enterprisedemo.model.request.CustomerOrderRequest;
import com.mahmutsazlik.enterprisedemo.model.response.CustomerOrderResponse;
import com.mahmutsazlik.enterprisedemo.repository.CustomerOrderRepository;
import com.mahmutsazlik.enterprisedemo.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

  private final CustomerOrderRepository customerOrderRepository;

  @Autowired
  public CustomerOrderServiceImpl(CustomerOrderRepository customerOrderRepository) {
    this.customerOrderRepository = customerOrderRepository;
  }

  @Transactional
  @Override
  public CustomerOrderResponse createCustomerOrders(CustomerOrderRequest request) {
    final List<CustomerOrderDto> customerOrderDtos = new ArrayList<>();
    final Long customerId = request.getCustomerId();

    request.getProductIds().stream()
        .forEach(productId -> {
          CustomerOrderDto customerOrderDto = new CustomerOrderDto();
          customerOrderDto.setCustomerId(customerId);
          customerOrderDto.setProductId(productId);

          customerOrderDtos.add(customerOrderDto);
        });

    final List<CustomerOrderEntity> customerOrderEntities = CustomerOrderMapper.INSTANCE.toCustomerOrderEntityList(customerOrderDtos);
    customerOrderRepository.saveAll(customerOrderEntities);

    final List<CustomerOrderDto> orderDtos = CustomerOrderMapper.INSTANCE.toCustomerOrderDtoList(customerOrderEntities);

    return CustomerOrderResponse.builder()
        .customerOrderDtos(orderDtos)
        .build();
  }
}

package com.mahmutsazlik.enterprisedemo.model.mapper;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerDto;
import com.mahmutsazlik.enterprisedemo.model.dto.CustomerOrderDto;
import com.mahmutsazlik.enterprisedemo.model.entity.CustomerOrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerOrderMapper {
  CustomerOrderMapper INSTANCE = Mappers.getMapper(CustomerOrderMapper.class);

  CustomerOrderDto toCustomerOrderDto(CustomerOrderEntity source);

  CustomerOrderEntity toCustomerOrderEntity(CustomerDto source);

  List<CustomerOrderDto> toCustomerOrderDtoList(List<CustomerOrderEntity> list);

  List<CustomerOrderEntity> toCustomerOrderEntityList(List<CustomerOrderDto> list);
}

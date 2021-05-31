package com.mahmutsazlik.enterprisedemo.model.mapper;

import com.mahmutsazlik.enterprisedemo.model.dto.CustomerDto;
import com.mahmutsazlik.enterprisedemo.model.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
  CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

  CustomerDto toCustomerDto(CustomerEntity source);

  CustomerEntity toCustomerEntity(CustomerDto source);

  List<CustomerDto> toCustomerDtoList(List<CustomerEntity> list);

  List<CustomerEntity> toCustomerEntityList(List<CustomerDto> list);
}

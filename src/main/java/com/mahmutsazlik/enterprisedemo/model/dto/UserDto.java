package com.mahmutsazlik.enterprisedemo.model.dto;

import com.mahmutsazlik.enterprisedemo.model.dto.base.BaseDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends BaseDto {
  private Long userId;
  private String username;
  private String email;
  private String password;
}

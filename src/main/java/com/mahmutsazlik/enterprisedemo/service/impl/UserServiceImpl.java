package com.mahmutsazlik.enterprisedemo.service.impl;

import com.mahmutsazlik.enterprisedemo.core.utilities.results.DataResult;
import com.mahmutsazlik.enterprisedemo.core.utilities.results.Result;
import com.mahmutsazlik.enterprisedemo.core.utilities.results.SuccessResult;
import com.mahmutsazlik.enterprisedemo.model.dto.UserDto;
import com.mahmutsazlik.enterprisedemo.repository.UserRepository;
import com.mahmutsazlik.enterprisedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Result create(UserDto user) {
    this.userRepository.save(user);
    return new SuccessResult("Kullanıcı eklendi.");
  }

  @Override
  public DataResult<UserDto> findByEmail(String email) {
    return null;
  }
}

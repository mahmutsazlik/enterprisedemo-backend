package com.mahmutsazlik.enterprisedemo.service;

import com.mahmutsazlik.enterprisedemo.core.utilities.results.DataResult;
import com.mahmutsazlik.enterprisedemo.core.utilities.results.Result;
import com.mahmutsazlik.enterprisedemo.model.dto.UserDto;

public interface UserService {
Result create(UserDto user);
DataResult<UserDto> findByEmail(String email);
}

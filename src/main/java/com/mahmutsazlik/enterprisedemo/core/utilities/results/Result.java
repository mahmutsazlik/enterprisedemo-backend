package com.mahmutsazlik.enterprisedemo.core.utilities.results;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

  private boolean isSuccess;
  private String message;

  public Result(boolean isSuccess) {
    this.isSuccess = isSuccess;
  }

  public Result(boolean isSuccess, String message) {
    this.isSuccess = isSuccess;
    this.message = message;
  }

}

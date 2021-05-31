package com.mahmutsazlik.enterprisedemo.core.utilities.results;

import lombok.AccessLevel;
import lombok.Getter;

public class DataResult<T> extends Result {

  private @Getter(AccessLevel.PROTECTED)
  T data;

  public DataResult(boolean isSuccess, T data) {
    super(isSuccess);
    this.data = data;
  }

  public DataResult(boolean isSuccess, String message, T data) {
    super(isSuccess, message);
    this.data = data;
  }
}

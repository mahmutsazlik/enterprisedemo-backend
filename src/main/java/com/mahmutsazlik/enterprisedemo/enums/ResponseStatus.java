package com.mahmutsazlik.enterprisedemo.enums;

import org.springframework.http.HttpStatus;

public enum ResponseStatus {
  OK(200, HttpStatus.OK, "Ok"),
  BAD_REQUEST(400, HttpStatus.BAD_REQUEST, "Bad Request");

  private final int value;
  private final HttpStatus status;
  private final String reasonPhrase;

  private ResponseStatus(int value, HttpStatus status, String reasonPhrase) {
    this.value = value;
    this.status = status;
    this.reasonPhrase = reasonPhrase;
  }
}
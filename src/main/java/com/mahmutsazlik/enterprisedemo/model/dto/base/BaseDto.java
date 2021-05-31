package com.mahmutsazlik.enterprisedemo.model.dto.base;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseDto {
  private String createdBy;
  private Date creationDate;
  private String lastModifiedBy;
  private Date lastModifiedDate;
}

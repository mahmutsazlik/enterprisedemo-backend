package com.mahmutsazlik.enterprisedemo.model.entity;

import com.mahmutsazlik.enterprisedemo.model.entity.base.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class CustomerEntity extends Auditable<String> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long customerId;

  @Column(name = "customerName")
  private String customerName;

  @Column(name = "customerSurname")
  private String customerSurname;
}
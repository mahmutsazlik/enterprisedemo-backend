package com.mahmutsazlik.enterprisedemo.model.entity;

import com.mahmutsazlik.enterprisedemo.model.entity.base.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customerOrder")
public class CustomerOrderEntity extends Auditable<String> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long customerOrderId;

  @Column(name = "customerId")
  private Long customerId;

  @Column(name = "productId")
  private Long productId;
}

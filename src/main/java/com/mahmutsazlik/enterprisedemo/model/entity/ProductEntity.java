package com.mahmutsazlik.enterprisedemo.model.entity;

import com.mahmutsazlik.enterprisedemo.model.entity.base.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity extends Auditable<String> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String productId;

  @Column(name = "productName")
  private String productName;

  @Column(name = "productDescription")
  private String productDescription;

  @Column(name = "productAmount")
  private BigDecimal productAmount;

  @Column(name = "productStockNumber")
  private Integer productStockNumber;

  @Column(name = "categoryId")
  private String categoryId;
}

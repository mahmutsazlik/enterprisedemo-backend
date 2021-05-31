package com.mahmutsazlik.enterprisedemo.model.entity;

import com.mahmutsazlik.enterprisedemo.model.entity.base.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity extends Auditable<String> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String categoryId;

  @Column(name = "categoryName")
  private String categoryName;

  @Column(name = "categoryDescription")
  private String categoryDescription;
}

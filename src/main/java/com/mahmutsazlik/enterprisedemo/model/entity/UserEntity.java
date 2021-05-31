package com.mahmutsazlik.enterprisedemo.model.entity;

import com.mahmutsazlik.enterprisedemo.model.entity.base.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity extends Auditable<String> {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "userId")
  private Long userId;

  @Column(name = "username")
  @NotBlank
  @NotNull
  private String username;

  @Column(name = "email")
  @Email
  @NotBlank
  @NotNull
  private String email;

  @Column(name = "password")
  @NotBlank
  @NotNull
  private String password;
}

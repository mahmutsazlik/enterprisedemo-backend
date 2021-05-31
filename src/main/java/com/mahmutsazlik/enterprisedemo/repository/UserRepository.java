package com.mahmutsazlik.enterprisedemo.repository;

import com.mahmutsazlik.enterprisedemo.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
  UserEntity findByEmail(String email);
}

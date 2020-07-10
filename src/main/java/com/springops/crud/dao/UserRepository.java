package com.springops.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springops.crud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>  {

}

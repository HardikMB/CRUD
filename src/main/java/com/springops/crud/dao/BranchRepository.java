package com.springops.crud.dao;


import com.springops.crud.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springops.crud.model.Branch;

import java.util.Optional;

public interface BranchRepository extends JpaRepository<Branch, Integer>{

    public Optional<Branch> findByPinCode(String pin);

    public Optional<Branch> findByAddress1Containing(String add1);

    public Optional<Branch> findByBranchState(String add1);
}

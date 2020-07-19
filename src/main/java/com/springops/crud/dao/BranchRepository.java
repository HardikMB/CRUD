package com.springops.crud.dao;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springops.crud.model.Branch;

import java.util.List;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{

    public List<Branch> findByPinCode(String pin);
    
    @Query("select b from Branch b where upper(b.address1)   like %:add1% or  upper(b.address2)   like %:add1% ")
    public List<Branch> findByAddress1Containing(String add1);

    public List<Branch> findByState(String state);
    
    public List<Branch> findByCity(String city);
    
    public List<Branch> findByCity(String city,Sort sort);
    
    
    
    
      
}

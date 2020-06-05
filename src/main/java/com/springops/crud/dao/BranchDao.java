package com.springops.crud.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
 
import com.springops.crud.model.Branch;

@RepositoryRestResource(collectionResourceRel = "Branch",path = "Branches")
public interface BranchDao extends JpaRepository<Branch, Integer>{

}

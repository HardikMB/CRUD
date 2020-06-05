package com.springops.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springops.crud.model.Region;

@Repository
public interface RegionDao extends JpaRepository<Region, Integer> {	

}

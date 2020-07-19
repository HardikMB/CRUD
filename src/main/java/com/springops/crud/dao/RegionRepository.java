package com.springops.crud.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springops.crud.model.Region;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
   // public Optional<Region> findByRegionName(String name);
    
	@Query("select r from Region r where upper(r.regionName) like %:name% ")
	public List<Region> findByRegionNameContaining(String name);

	@Override
default Page<Region> findAll(Pageable pageable) {
	// TODO Auto-generated method stub
	return null;
}

 public List<Region> findByRegionName(String name);
 
}

package com.springops.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springops.crud.model.Region;

import java.util.Optional;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
    public Optional<Region> findByRegionName(String name);
    public Optional<Region> findByRegionNameContaining(String name);

}

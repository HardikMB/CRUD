package com.springops.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springops.crud.model.Region;

@Service
public interface regionService {

	public List<Region>getRegions();
	public Optional<Region> getRegion(String id);
	public void delRegion(int regionId);
	public void insertRegion(Region regionval);
	public Region updateRegion(Region region);
}

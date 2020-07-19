package com.springops.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springops.crud.model.Region;

@Service
public interface regionService {

	public List<Region>getRegions();
	public List<Region> getRegion(String id);
	public Region getRegion(Integer regionId);
	public void delRegion(int regionId);
	public Region insertRegion(Region regionval);
	public Region updateRegion(Region region);
	public List<Region> findRegion(String regionName);
}

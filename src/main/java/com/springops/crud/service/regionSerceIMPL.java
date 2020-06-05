package com.springops.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springops.crud.dao.RegionDao;
import com.springops.crud.model.Region;

@Component
public class regionSerceIMPL implements regionService {
	@Autowired
	private RegionDao region;
	@Override
	public List<Region> getRegions() {
		// TODO Auto-generated method stub
		return  region.findAll();
		
	}
	@Override
	public Optional<Region> getRegion(String regionId) {
		// TODO Auto-generated method stub
		
		return region.findById(Integer.parseInt(regionId));
				//getOne(Integer.parseInt(regionId));
	}
	
	public void delRegion(int regionId) {
		region.deleteById(regionId);
	}

	public void insertRegion(Region regionval) {
		region.save(regionval);
	}
	
	public Region updateRegion(Region regionVal) {
	regionVal.setRegionName("Sanewadi");
	region.save(regionVal);
	return regionVal;
	
	}
	
	
}

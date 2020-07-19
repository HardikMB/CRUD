package com.springops.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import com.springops.crud.dao.RegionRepository;
import com.springops.crud.model.Region;

@Component
public class regionSerceIMPL implements regionService {



	@Autowired
	private RegionRepository regionRepository;

	@Override
	public List<Region> getRegions() {

		return regionRepository.findAll();
	}

	@Override
	public List<Region> getRegion(String regioname) {

		System.out.println("Inside Service Method,"+regioname);
		if( regioname == null)
			return regionRepository.findAll(Sort.by(Direction.ASC, "regionName"));;

		return regionRepository.findByRegionName(regioname);

	}

	@Override
	public void delRegion(int regionId) {
		regionRepository.delete(regionRepository.findById(regionId).get());

	}

	@Override
	public Region insertRegion(Region regionval) {
		return regionRepository.save(regionval);

	}

	@Override
	public Region updateRegion(Region region) {
		regionRepository.save(region);
		return region;	 
	}

	@Override
	public List<Region> findRegion(String regionName) {
		if( regionName == null)
			return regionRepository.findAll();

		return regionRepository.findByRegionNameContaining(regionName.toUpperCase());
	}

	public Region getRegion(Integer regionId) {

		Region reg = regionRepository.findById(regionId).get();

		if (reg.getRegionId() == 1) {
			throw new RuntimeException("Something wrong in Home Controller! Are you searching for region id 1?");
		}
		return reg;
	}
}

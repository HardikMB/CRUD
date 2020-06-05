package com.springops.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springops.crud.dao.RegionDao;
import com.springops.crud.model.Region;
import com.springops.crud.service.regionSerceIMPL;
import com.springops.crud.service.regionService;

@RestController
public class HomeController {

	@Autowired
	public regionService rgnservice;  
	
	  @GetMapping(value="/regions") public List<Region> getRegions(){
		  
		  return rgnservice.getRegions();
	  }
	 

	  @GetMapping(value="/regions/show/{regionId}") 
	  public Optional<Region> getRegion(@PathVariable String regionId){
		  System.out.println("Requesting region for: "+regionId);
		  return rgnservice.getRegion(regionId);
	  }
	  
	  @DeleteMapping(value="/regions/delete/{regionId}")
	public void delRegion(@PathVariable("regionId") int regionId) {
	 System.out.println("Deleting the region with Id: "+regionId);
	 rgnservice.delRegion(regionId);
	  }
	  
	  @PostMapping(value = "/region/add")
	  public void insertRegion(@RequestBody Region region) {
		  rgnservice.insertRegion(region);
	  }
	  
	  @PutMapping(value = "region/update")
		  public void updatetheRegion(@RequestBody Region region) {
		  rgnservice.updateRegion(region) ;
	  }
	  
}

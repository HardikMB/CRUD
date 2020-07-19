package com.springops.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springops.crud.model.Region;
import com.springops.crud.service.regionSerceIMPL;

@RestController
public class RegionController {

	@Autowired
	regionSerceIMPL regionService;


	@GetMapping("/region")

	public List<Region> searchRegion(@RequestParam(required = false) String regioname) {
    System.out.println("Controller:Regionname is "+regioname);
		return	regionService.getRegion(regioname);
	}

	@GetMapping("/regioNameLike")
	public List<Region> searchRegionlike(@RequestParam(required = false) String regioNameLike) {
		return 	regionService.findRegion(regioNameLike);
	}

	@GetMapping("/region/{regionId}")
	@ResponseBody
	public  Region  getRegionById(@PathVariable(value = "regionId") String regionId) {
		return regionService.getRegion(Integer.parseInt(  regionId));
	}

	@PostMapping("/region")
	public Region createRegion(@Valid @RequestBody Region region) throws Exception {
		return regionService.insertRegion(region);
	}

	@PutMapping("/region/{regionId}")
	@ResponseBody
	public Region  updateRegion(@Valid @RequestBody Region region) {
		return regionService.updateRegion(region);
	}

	@DeleteMapping("/region/{regionId}")
	public Boolean deleteRegion(@PathVariable(value = "regionId") Integer regionId) {
		
		regionService.delRegion(regionId);
		
		return true;
	}

}
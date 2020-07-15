package com.springops.crud.controller;

import java.util.List;
import java.util.Optional;

import com.springops.crud.dao.BranchRepository;
import com.springops.crud.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.springops.crud.dao.RegionRepository;
import com.springops.crud.model.Region;
import com.springops.crud.service.regionService;

import javax.validation.Valid;


@RestController
public class HomeController {


	@Autowired
	public RegionRepository regionRepository;

	@Autowired
	public BranchRepository branchRepository;

	//	@GetMapping("/region")
	//	public List < Region >  getAllRegions() {
	//		return regionRepository.findAll();
	//	}

	@GetMapping("/region")
	public List<Region> searchRegion(@RequestParam(required = false) String regioname){
		if( regioname == null)
			return regionRepository.findAll();

		return regionRepository.findByRegionName(regioname);
	}

	@GetMapping("/regioNameLike")
	public List<Region> searchRegionlike(@RequestParam(required = false) String regioNameLike){
		if( regioNameLike == null)
			return regionRepository.findAll();

		return regionRepository.findByRegionNameContaining(regioNameLike.toUpperCase());
	}



	@GetMapping("/region/{regionId}")
	public ResponseEntity< Region > getRegionById(@PathVariable(value = "regionId") Integer regionId)
	{
		Region reg = regionRepository.findById(regionId).get();

		if (reg.getRegionId() == 1) {
			throw new RuntimeException("Something wrong in Home Controller! Are you searching for region id 1?");
		}
		return ResponseEntity.ok().body(reg);
	}

	//	@GetMapping("/region")
	//	public  Optional<Region> searchRegionbyRegionName(@RequestParam ("RegionName") String name)
	//	{
	//		return regionRepository.findByRegionName(name);
	//	}

	@PostMapping("/region")
	public Region createRegion(@Valid @RequestBody Region region) throws Exception {
		return regionRepository.save(region);
	}

	@PutMapping("/region/{regionId}")
	public ResponseEntity < Region > updateRegion(@Valid @RequestBody Region region) {
		regionRepository.save(region);
		return ResponseEntity.ok(region);
	}

	@DeleteMapping("/region/{regionId}")
	public Boolean deleteRegion(@PathVariable(value = "regionId") Integer regionId) {
		regionRepository.delete(regionRepository.findById(regionId).get());
		return true;
	}

	@GetMapping("/branch")
	public List < Branch >  getAllBranches() {
		return branchRepository.findAll();
	}

	@GetMapping("/branchbyPin")
	public List < Branch >  getAllBranchesPinWise(
			@RequestParam (required = false) String pin) {

		if (pin!=null) {
			return branchRepository.findByPinCode(pin);
		}
		return branchRepository.findAll();
	}
	
	@GetMapping("/branchbyCity")
	public List < Branch >  getAllBranchesCityWise(
			@RequestParam (required = false) String city) {

		if (city!=null) {
			return branchRepository.findBybranchCity(city);
		}
		return branchRepository.findAll();
	}

	@GetMapping("/branchbyState")
	public List < Branch >  getAllBranchesStateWise(
			@RequestParam (required = false) String state) {

		if (state!=null) {
			return 	branchRepository.findByBranchState(state);
		}
		return branchRepository.findAll();
	}

	@GetMapping("/branchbyAddress")
	public List < Branch >  getAllBranchesbyAddress(
			@RequestParam (required = false) String add1) {

		if (add1!=null) {
			return 	branchRepository.findByAddress1Containing(add1.toUpperCase());
		}
		return branchRepository.findAll();
	}

	
	
	@GetMapping("/branch/{branchId}")
	public ResponseEntity< Branch > getBranchById(@PathVariable(value = "branchId") Integer branchId)
	{

		Branch reg = branchRepository.findById(branchId).get();
		return ResponseEntity.ok().body(reg);


	}

	@PostMapping("/branch")
	public Branch createBranch(@Valid @RequestBody Branch branch) {
		System.out.println(branch.getRegion());
		return branchRepository.save(branch);
	}

	@PutMapping("/branch/{branchId}")
	public ResponseEntity < Branch > updateBranch(@Valid @RequestBody Branch branch) {
		branchRepository.save(branch);
		return ResponseEntity.ok(branch);
	}

	@DeleteMapping("/branch/{branchId}")
	public Boolean deleteBranch(@PathVariable(value = "branchId") Integer branchId) {
		branchRepository.delete(branchRepository.findById(branchId).get());
		return true;
	}
}

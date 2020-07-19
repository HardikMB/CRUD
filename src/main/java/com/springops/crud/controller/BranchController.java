package com.springops.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springops.crud.dao.BranchRepository;
import com.springops.crud.model.Branch;
import com.springops.crud.service.BranchService;

@RestController
public class BranchController  {

	@Autowired
	public BranchRepository branchRepository;
    
	@Autowired
	private BranchService branchService;

	@GetMapping("/branch")
	public List < Branch > allBranches() {
		return branchService.getAllBranches();
	}

	@GetMapping("/branchbyPin")
	public List < Branch > allBranchesPinWise(@RequestParam (required = false) String pin) {
		return branchService.getAllBranchesPinWise(pin);
	}

	@GetMapping("/branchbyCity")
	public List < Branch > allBranchesCityWise(@RequestParam (required = false) String city,@RequestParam (required = false) String sort) {
	return branchService.getAllBranchesCityWise(city,sort);
	}

	@GetMapping("/branchbyState")
	public List < Branch > allBranchesStateWise(@RequestParam (required = false) String state) {
	
		return branchService.getAllBranchesStateWise(state);
	}

	@GetMapping("/branchbyAddress")
	public List < Branch > AllBranchesbyAddress(@RequestParam (required = false) String add1) {
	
		return branchService.getAllBranchesbyAddress(add1);
	}

	@GetMapping("/branch/{branchId}")
	public ResponseEntity< Branch > getBranchById(@PathVariable(value = "branchId") Integer branchId) {
		return branchService.getBranchById(branchId);
	
	}

	@PostMapping("/branch")
	public Branch createBranch(@Valid @RequestBody Branch branch) {
		return branchService.createBranch(branch);
	}

	@PutMapping("/branch/{branchId}")
	public ResponseEntity < Branch > updateBranch(@Valid @RequestBody Branch branch) {
		return branchService.updateBranch(branch);
	}

	@DeleteMapping("/branch/{branchId}")
	public Boolean deleteBranch(@PathVariable(value = "branchId") Integer branchId) {
		 branchService.deleteBranch(branchId);
		return true;
	}

}
package com.springops.crud.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.springops.crud.dao.BranchRepository;
import com.springops.crud.model.Branch;

@Service
public class BranchService {



	@Autowired
	public BranchRepository branchRepository;



	public List < Branch > getAllBranches() {
		return branchRepository.findAll();
	}


	public List < Branch > getAllBranchesPinWise(String pin) {

		if (pin!=null) {
			return branchRepository.findByPinCode(pin);
		}
		return branchRepository.findAll();
	}


	public List < Branch > getAllBranchesCityWise(String city, String sort) {

		if (city!=null && sort!=null) {

			if(sort.compareTo("DESC") ==0)
			{
				System.out.println("Sorting will be DESC by City:"+sort);
				return branchRepository.findByCity(city,

						Sort.by(Direction.DESC, "pinCode"));
			}
				else if(sort.compareTo("ASC") ==0  )
				{
					System.out.println("Sorting will be ASC by City:"+sort);
					return branchRepository.findByCity(city,

						Sort.by(Direction.ASC, "pinCode"));
				}

		}
		System.out.println("No default Sorting applied:"+city+" by "+sort);
		return branchRepository.findAll();
	}



	public List < Branch > getAllBranchesStateWise(String state) {

		if (state!=null) {
			return 	branchRepository.findByState(state);
		}
		return branchRepository.findAll();
	}


	public List < Branch > getAllBranchesbyAddress( String add1) {

		if (add1!=null) {
			return 	branchRepository.findByAddress1Containing(add1.toUpperCase());
		}
		return branchRepository.findAll();
	}


	public ResponseEntity< Branch > getBranchById( Integer branchId) {

		Branch reg = branchRepository.findById(branchId).get();
		return ResponseEntity.ok().body(reg);


	}

	public Branch createBranch(Branch branch) {
		System.out.println(branch.getRegion());
		return branchRepository.save(branch);
	}

	public ResponseEntity < Branch > updateBranch( Branch branch) {
		branchRepository.save(branch);
		return ResponseEntity.ok(branch);
	}

	public Boolean deleteBranch( Integer branchId) {
		if(branchRepository.findById(branchId).get()!= null) { 
			branchRepository.delete(branchRepository.findById(branchId).get());
			return true;
		}
		return false;

	}

}

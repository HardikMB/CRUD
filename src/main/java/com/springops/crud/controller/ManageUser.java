package com.springops.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springops.crud.dao.UserRepository;
import com.springops.crud.model.User;

@RestController
public class ManageUser<Model> {

	//private User user;

	@Autowired
	private UserRepository userRepository; 

	@PostMapping("/AddUser")
	public User insertUser(@Valid @RequestBody User userr , BindingResult result, Model m){
//		try {
			 
			System.out.println(userr.toString());
			 	userRepository.save(userr);
//		}
//		catch(Exception ex){
//			System.out.println("Here Exception will be catched"+ ex.getMessage());
//		}
//		finally {
//			System.out.println("Here final code will be executed");
//		}
//		
			 	return userr;
	}

	@GetMapping ("/ViewUsers")
	public List<User> viewUser()
	{
		return userRepository.findAll();
	}
}

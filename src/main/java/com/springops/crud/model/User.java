package com.springops.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.springops.crud.validator.BloodGroup;

@Entity
@Table(name = "USER")
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "USER_ID")
    private int userId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "BLOOD_GROUP")
	@BloodGroup
	private String bloodGroup;
	
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Firstname: "+firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String toString () {
		return this.getUserId() +":"+this.getFirstName() +" "+ this.getLastName()+"'s Blood Group is " +this.getBloodGroup();
	}
	
	public User() {
		System.out.println("Calling Constructor");
		System.out.println(	this.toString());
	
	}
}

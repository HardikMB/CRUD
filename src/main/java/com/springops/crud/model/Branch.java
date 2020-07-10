package com.springops.crud.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "Branch_master")
public class Branch {

	@Id
	@Column(name = "Branch_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branchId;
	@Column(name = "BRANCH_CODE")
	private String branchCode;
	
	@Size(min = 5)
	@NotNull
	@Column(name = "ADDRESS1")
	private String address1;
	

	@Column(name = "ADDRESS2")
	private String address2;
	
	@NotNull
	@Column(name = "BRANCH_CITY")
	private String branchCity;
	
	@NotNull
	@Column(name = "BRANCH_STATE")
	private String branchState;
	
	@NotNull
	@Column(name = "PIN_CODE")
	private String pinCode;
	
	@NotNull
	@Column(name = "IFSC_CODE")
	private String iFSCcode;
	
	@NotNull
	@Email (message = "Email Should be valid")
	@Column(name =  "BRANCH_MAIL")
	private String branchMail;
	
	@ManyToOne(fetch=FetchType.LAZY,optional = false)
	@JoinColumn( name = "region_Id",nullable = false)
	@JsonBackReference
	private Region region;


	public int getBranchId() {
		return branchId;
	}


	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}


	public String getBranchCode() {
		return branchCode;
	}


	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getBranchCity() {
		return branchCity;
	}


	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}


	public String getBranchState() {
		return branchState;
	}


	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public String getiFSCcode() {
		return iFSCcode;
	}


	public void setiFSCcode(String iFSCcode) {
		this.iFSCcode = iFSCcode;
	}


	public Region getRegion() {
		System.out.println("Region Name:"+ region.getRegionName());
		return region;
	}


	public void setRegion(Region region) {
		this.region = region;
	}


	public String getBranchMail() {
		return branchMail;
	}


	public void setBranchMail(String branchMail) {
		this.branchMail = branchMail;
	}


 
}




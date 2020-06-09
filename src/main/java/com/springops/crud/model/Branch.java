package com.springops.crud.model;


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

import net.minidev.json.annotate.JsonIgnore;


@Entity
@Table(name = "Branch_master")
public class Branch {

	@Id
	@Column(name = "Branch_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branchId;
	@Column(name = "BRANCH_CODE")
	private String branchCode;
	
	@Column(name = "ADDRESS1")
	private String address1;
	
	@Column(name = "ADDRESS2")
	private String address2;
	
	@Column(name = "BRANCH_CITY")
	private String branchCity;
	
	@Column(name = "BRANCH_STATE")
	private String branchState;
	
	@Column(name = "PIN_CODE")
	private String pinCode;
	
	@Column(name = "IFSC_CODE")
	private String iFSCcode;
	
	
//	@ManyToOne(targetEntity = Region.class,fetch=FetchType.LAZY,cascade = CascadeType.ALL)
@JoinColumn( name = "region_Id",nullable = false)
@JsonIgnore
	@ManyToOne
	private Region theregion;


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
		return theregion;
	}


	public void setRegion(Region region) {
		this.theregion = region;
	}


 
}




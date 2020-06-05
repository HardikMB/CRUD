package com.springops.crud.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Branch_master")
public class Branch {

	@Id
	 
	@Column(name = "Branch_id")
	private int BranchId;
	@Column(name = "BRANCH_CODE")
	private String BranchCode;
	
	@Column(name = "ADDRESS1")
	private String Address1;
	
	@Column(name = "ADDRESS2")
	private String Address2;
	
	@Column(name = "BRANCH_CITY")
	private String BranchCity;
	
	@Column(name = "BRANCH_STATE")
	private String BranchState;
	
	@Column(name = "PIN_CODE")
	private String PinCode;
	
	@Column(name = "IFSC_CODE")
	private String IFSCcode;
	
	
	@ManyToOne
	@JoinColumn(name = "region_id",nullable = false)
	private Region region;


	public int getBranchId() {
		return BranchId;
	}


	public void setBranchId(int branchId) {
		BranchId = branchId;
	}


	public String getBranchCode() {
		return BranchCode;
	}


	public void setBranchCode(String branchCode) {
		BranchCode = branchCode;
	}


	public String getAddress1() {
		return Address1;
	}


	public void setAddress1(String address1) {
		Address1 = address1;
	}


	public String getAddress2() {
		return Address2;
	}


	public void setAddress2(String address2) {
		Address2 = address2;
	}


	public String getBranchCity() {
		return BranchCity;
	}


	public void setBranchCity(String branchCity) {
		BranchCity = branchCity;
	}


	public String getBranchState() {
		return BranchState;
	}


	public void setBranchState(String branchState) {
		BranchState = branchState;
	}


	public String getPinCode() {
		return PinCode;
	}


	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}


	public String getIFSCcode() {
		return IFSCcode;
	}


	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}


	public Region getRegion() {
		return region;
	}


	public void setRegion(Region region) {
//		this.region.setRegionId(region.getRegionId());
		this.region = region;
	}
 
}




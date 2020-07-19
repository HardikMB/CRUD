package com.springops.crud.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OrderBy;
import org.hibernate.annotations.Sort;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name ="REGIONS")
public class Region {
	
@Id 
@Column(name = "REGION_ID")
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int regionId;
	
	
	@NotNull (message = "Region name cannot be null")

	@Column(name = "REGION_NAME")
	private String regionName;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@OneToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "region")
	@JsonManagedReference
	@OrderBy(clause = "state desc")
	private List<Branch> branch;

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

 
	
	
}

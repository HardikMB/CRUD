package com.springops.crud.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private List<Branch> branch;

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

 
	
	
}

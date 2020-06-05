package com.springops.crud.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name ="REGIONS")
public class Region {
	
	@Id 
@Column(name = "REGION_ID")
	private int regionId;
	
	@Column(name = "REGION_NAME")
	private String regionName;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "region")
	private Set<Branch> Branch;

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


}

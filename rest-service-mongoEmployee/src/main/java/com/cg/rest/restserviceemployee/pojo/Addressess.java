package com.cg.rest.restserviceemployee.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Addressess {

	private String flatNo;
	private String buildingName;
	private String street;

	private String city;
	public Addressess(String flatNo, String buildingName, String street, String city, String pincode) {
		super();
		this.flatNo = flatNo;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	private String pincode;

	public Addressess() {

	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Addressess [flatNo=" + flatNo + ", buildingName=" + buildingName + ", street=" + street + ", city="
				+ city + ", pincode=" + pincode + "]";
	}
}

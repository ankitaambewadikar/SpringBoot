package com.cg.rest.restservicedemo.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String flatNo;
	private String buildingName;
	private String street;

	public Address() {
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	private String city;
	private String pincode;

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
		return "Address [flatNo=" + flatNo + ", buildingName=" + buildingName + ", street=" + street + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}

}

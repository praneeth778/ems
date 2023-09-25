package com.example.ems;

public class address {
	
	private String aId;
	private String area;
	private int pincode;
	private String state;
	private String city;
	private String landmark;
	
	public address() {
		
	}
	
	public address(String aId,String area,int pincode,String state,String city,String landmark) {
		super();
		this.aId=aId;
		this.area=area;
		this.pincode=pincode;
		this.state=state;
		this.city=city;
		this.landmark=landmark;
	}

	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	
	

}

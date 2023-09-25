package com.example.ems;

public class leave {
	private String lid;
	private String startdate;
	private String enddate;
	private String type;
	
	public leave() {
		
	}
	 public leave(String lid,String startdate,String enddate,String type) {
		 super();
		 this.lid=lid;
		 this.startdate=startdate;
		 this.enddate=enddate;
		 this.type=type;
	 }
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 
	
}

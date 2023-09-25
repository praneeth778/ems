package com.example.ems;

public class Employee {
	private String eid;
	private String name;
	private String fname;
	private String lname;
	private String did;
	private String manager;
	private String dob;
	private String aid;
	private String cid;
	private String lid;
	
	
	public Employee() {
		
	}
	public Employee(String eid,String name,String fname,String lname,String did,String manager,String dob,String aid,String cid,String lid) {
		super();
		this.eid=eid;
		this.name=name;
		this.fname=fname;
		this.lname=lname;
		this.did=did;
		this.manager=manager;
		this.dob=dob;
		this.aid=aid;
		this.cid=cid;
		this.lid=lid;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	
	
}

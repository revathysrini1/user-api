package com.pck.userinfo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Userdata {
	
	
	@Id
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	private String fname;
	private String lname;
	public Userdata(String id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	public Userdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}

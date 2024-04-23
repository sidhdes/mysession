package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class login {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rid;
	private String rname;
	private String remail;
	private String rpass;
	private String rcpass;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public String getRpass() {
		return rpass;
	}
	public void setRpass(String rpass) {
		this.rpass = rpass;
	}
	public String getRcpass() {
		return rcpass;
	}
	public void setRcpass(String rcpass) {
		this.rcpass = rcpass;
	}
}

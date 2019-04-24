package com.chinasofti.yahui.domain;

import java.io.Serializable;

public class work implements Serializable{
	private int eid;
	private int ejob;
	private String ename;
	private int epassword;
	
	public work() {
		super();
	}
	
	public work(int eid,int ejob,String ename,int epassword) {
		super();
		this.eid = eid;
		this.ejob = ejob;
		this.epassword = epassword;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEjob() {
		return ejob;
	}

	public void setEjob(int ejob) {
		this.ejob = ejob;
	}

	public int getEpassword() {
		return epassword;
	}

	public void setEpassword(int epassword) {
		this.epassword = epassword;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

}
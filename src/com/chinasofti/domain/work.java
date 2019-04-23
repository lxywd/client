package com.chinasofti.domain;

import java.io.Serializable;
public class work implements Serializable{
	private int eid;//员工id
	private String ejob;
	private String ename;
	private int epassword;
	public work(int eid,String ejob,String ename,int epassword) {
		super();
		this.eid =eid;
		this.ejob=ejob;
		this.ename =ename;
		this.epassword =epassword;
	}
	public work() {
		super();
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEjob() {
		return ejob;
	}
	public void setEjob(String ejob) {
		this.ejob = ejob;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEpassword() {
		return epassword;
	}
	public void setEpassword(int epassword) {
		this.epassword = epassword;
	}
	@Override
	public String toString() {
	
		return this.eid+"\t"+this.ename+"\t"+this.ename+"\t"+this.ejob;
	}
}

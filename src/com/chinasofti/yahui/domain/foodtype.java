package com.chinasofti.yahui.domain;

import java.io.Serializable;
public class foodtype implements Serializable{
	private int ftid;
	private String ftname;
	public foodtype(int ftid,String ftname) {
		super();
		this.ftid =ftid;
		this.ftname =ftname;
	}
	public foodtype() {
		super();
	}
	public int getFtid() {
		return ftid;
	}
	public void setFtid(int ftid) {
		this.ftid = ftid;
	}
	public String getFtname() {
		return ftname;
	}
	public void setFtname(String ftname) {
		this.ftname = ftname;
	}
}

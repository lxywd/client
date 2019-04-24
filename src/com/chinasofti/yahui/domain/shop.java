package com.chinasofti.yahui.domain;

import java.io.Serializable;
public class shop implements Serializable{
	private int fid;
	private String fname;
	private double fprice;
	private int snum;
	
	public shop(int fid,String fname,double fprice,int snum) {
		super();
		this.fid =fid;
		this.fname =fname;
		this.fprice =fprice;
		this.snum =snum;
	}
	public shop() {
		super();
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getFprice() {
		return fprice;
	}
	public void setFprice(double fprice) {
		this.fprice = fprice;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	
}
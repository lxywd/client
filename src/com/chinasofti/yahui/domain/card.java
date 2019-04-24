package com.chinasofti.yahui.domain;

import java.io.Serializable;

public class card implements Serializable{
	private int cid;
	private String cname;
	private int cpassword;
	private int vip;
	private int mon;
	private int dj;
	public card() {
		super();
	}
	public card(int cid, String cname, int cpassword, int vip, int mon, int dj) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpassword = cpassword;
		this.vip = vip;
		this.mon = mon;
		this.dj = dj;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCpassword() {
		return cpassword;
	}
	public void setCpassword(int cpassword) {
		this.cpassword = cpassword;
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	public int getMon() {
		return mon;
	}
	public void setMon(int mon) {
		this.mon = mon;
	}
	public int getDj() {
		return dj;
	}
	public void setDj(int dj) {
		this.dj = dj;
	}
	
}

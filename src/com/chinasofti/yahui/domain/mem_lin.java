package com.chinasofti.yahui.domain;

import java.io.Serializable;

public class mem_lin implements Serializable{
	private int cid;
	private int vip;
	private int pre_quo;
	public mem_lin() {
		super();
	}
	public mem_lin(int cid, int vip, int pre_quo) {
		super();
		this.cid = cid;
		this.vip = vip;
		this.pre_quo = pre_quo;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	public int getPre_quo() {
		return pre_quo;
	}
	public void setPre_quo(int pre_quo) {
		this.pre_quo = pre_quo;
	}
	
}

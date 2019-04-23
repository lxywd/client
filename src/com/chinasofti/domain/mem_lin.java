package com.chinasofti.domain;

import java.io.Serializable;

public class mem_lin implements Serializable{
	private int vip;
	private double pre_quo;
	public mem_lin(int vip,double pre_quo) {
		super();
		this.vip =vip;
		this.pre_quo=pre_quo;
	}
	public mem_lin() {
		super();
	}
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	public double getPre_quo() {
		return pre_quo;
	}
	public void setPre_quo(double pre_quo) {
		this.pre_quo = pre_quo;
	}
}
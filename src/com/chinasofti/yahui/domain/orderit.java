package com.chinasofti.yahui.domain;

import java.io.Serializable;

public class orderit implements Serializable{
	private int oid;
	private int fid;
	private int onumber;
	public orderit() {
		super();
	}
	public orderit(int oid, int fid, int onumber) {
		super();
		this.oid = oid;
		this.fid = fid;
		this.onumber = onumber;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getOnumber() {
		return onumber;
	}
	public void setOnumber(int onumber) {
		this.onumber = onumber;
	}
	
}

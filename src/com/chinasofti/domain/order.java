package com.chinasofti.domain;

import java.io.Serializable;
import java.util.Date;

public class order implements Serializable{
	private int oid;
	private String uuid;
	private Date odate;
	private int eid;
	private String cid;
	private double aid;
	private int osum;
	private double oimon;
	private double oomon;
	private int o_chway;
	
	public order(int oid, String uuid,Date odate,int eid,String cid,double aid,int osum,double oimon,double oomon,int o_chway) {
		super();
		this.oid =oid;
		this.uuid =uuid;
		this.odate =odate;
		this.eid =eid;
		this.cid =cid;
		this.aid =aid;
		this.osum =osum;
		this.oimon =oimon;
		this.oomon =oomon;
		this.o_chway =o_chway;
	}

	public order() {
		super();
	}
	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getOdate() {
		return odate;
	}

	public void setOdate(Date odate) {
		this.odate = odate;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public double getAid() {
		return aid;
	}

	public void setAid(double aid) {
		this.aid = aid;
	}

	public int getOsum() {
		return osum;
	}

	public void setOsum(int osum) {
		this.osum = osum;
	}

	public double getOimon() {
		return oimon;
	}

	public void setOimon(double oimon) {
		this.oimon = oimon;
	}

	public double getOomon() {
		return oomon;
	}

	public void setOomon(double oomon) {
		this.oomon = oomon;
	}

	public int getO_chway() {
		return o_chway;
	}

	public void setO_chway(int o_chway) {
		this.o_chway = o_chway;
	}
	
}
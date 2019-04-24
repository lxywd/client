package com.chinasofti.yahui.domain;

import java.io.Serializable;

public class orderr implements Serializable{
	private int oid;
	private String uuid;
	private String odate;
	private int eid;
	private int cid;
	private String aid;
	private int osum;
	private int oimon;
	private int oomon;
	public orderr() {
		super();
	}
	public orderr(int oid, String uuid, String odate, int eid, int cid, String aid, int osum, int oimon, int oomon) {
		super();
		this.oid = oid;
		this.uuid = uuid;
		this.odate = odate;
		this.eid = eid;
		this.cid = cid;
		this.aid = aid;
		this.osum = osum;
		this.oimon = oimon;
		this.oomon = oomon;
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
	public String getOdate() {
		return odate;
	}
	public void setOdate(String odate) {
		this.odate = odate;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public int getOsum() {
		return osum;
	}
	public void setOsum(int osum) {
		this.osum = osum;
	}
	public int getOimon() {
		return oimon;
	}
	public void setOimon(int oimon) {
		this.oimon = oimon;
	}
	public int getOomon() {
		return oomon;
	}
	public void setOomon(int oomon) {
		this.oomon = oomon;
	}
	
}

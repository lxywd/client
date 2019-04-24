package com.chinasofti.yahui.domain;
import java.io.Serializable;
public class food implements Serializable{
	private int fid;
	private int ftid;
	private String fname;
	private double fprice;
	private int stock;
	private String spc_food;
	public food(int fid,int ftid,String fname,double fprice,int stock,String spc_food) {
		super();
		this.fid =fid;
		this.ftid =ftid;
		this.fname =fname;
		this.fprice =fprice;
		this.stock =stock;
		this.spc_food =spc_food;
	}
	public food() {
		super();
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getFtid() {
		return ftid;
	}
	public void setFtid(int ftid) {
		this.ftid = ftid;
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSpc_food() {
		return spc_food;
	}
	public void setSpc_food(String spc_food) {
		this.spc_food = spc_food;
	}

}

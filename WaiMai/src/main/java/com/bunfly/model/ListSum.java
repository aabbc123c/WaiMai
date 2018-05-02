package com.bunfly.model;

public class ListSum {
	private int id;
	private int buyerid;
	private String time;
	private double payrmb;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPayrmb() {
		return payrmb;
	}
	public void setPayrmb(double payrmb) {
		this.payrmb = payrmb;
	}
	public ListSum(int id, int buyerid, String time, double payrmb) {
		super();
		this.id = id;
		this.buyerid = buyerid;
		this.time = time;
		this.payrmb = payrmb;
	}
	public ListSum() {
		super();
	}
	@Override
	public String toString() {
		return "ListSum [id=" + id + ", buyerid=" + buyerid + ", time=" + time + ", payrmb=" + payrmb + "]";
	}
}

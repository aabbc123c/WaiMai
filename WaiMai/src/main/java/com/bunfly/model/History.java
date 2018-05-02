package com.bunfly.model;

public class History {
	private int id;
	private int buyerid;
	private int foodid;
	private String time;
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
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public History(int id, int buyerid, int foodid, String time) {
		super();
		this.id = id;
		this.buyerid = buyerid;
		this.foodid = foodid;
		this.time = time;
	}
	public History() {
		super();
	}
	@Override
	public String toString() {
		return "History [id=" + id + ", buyerid=" + buyerid + ", foodid=" + foodid + ", time=" + time + "]";
	}
	

}

package com.bunfly.model;

public class Comment {
	private int id;
	private int buyerid;
	private String buyertalk;
	private int storeid;
	private String storetalk;
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
	public String getBuyertalk() {
		return buyertalk;
	}
	public void setBuyertalk(String buyertalk) {
		this.buyertalk = buyertalk;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public String getStoretalk() {
		return storetalk;
	}
	public void setStoretalk(String storetalk) {
		this.storetalk = storetalk;
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
	public Comment(int id, int buyerid, String buyertalk, int storeid, String storetalk, int foodid, String time) {
		super();
		this.id = id;
		this.buyerid = buyerid;
		this.buyertalk = buyertalk;
		this.storeid = storeid;
		this.storetalk = storetalk;
		this.foodid = foodid;
		this.time = time;
	}
	public Comment() {
		super();
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", buyerid=" + buyerid + ", buyertalk=" + buyertalk + ", storeid=" + storeid
				+ ", storetalk=" + storetalk + ", foodid=" + foodid + ", time=" + time + "]";
	}
	

}

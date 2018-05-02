package com.bunfly.model;

public class CookedFood {
	private int id;
	private String foodname;
	private int storeid;
	private double payrmb;
	private String foodpicture;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public double getPayrmb() {
		return payrmb;
	}
	public void setPayrmb(double payrmb) {
		this.payrmb = payrmb;
	}
	public String getFoodpicture() {
		return foodpicture;
	}
	public void setFoodpicture(String foodpicture) {
		this.foodpicture = foodpicture;
	}
	public CookedFood(int id, String foodname, int storeid, double payrmb, String foodpicture) {
		super();
		this.id = id;
		this.foodname = foodname;
		this.storeid = storeid;
		this.payrmb = payrmb;
		this.foodpicture = foodpicture;
	}
	public CookedFood() {
		super();
	}
	@Override
	public String toString() {
		return "CookedFood [id=" + id + ", foodname=" + foodname + ", storeid=" + storeid + ", payrmb=" + payrmb
				+ ", foodpicture=" + foodpicture + "]";
	}
	

}

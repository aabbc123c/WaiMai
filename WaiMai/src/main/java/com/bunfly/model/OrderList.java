package com.bunfly.model;

public class OrderList {
	private int id;
	private int quantity;
	private int foodid;
	private int storeid;
	private String msg;
	private int state;
	private int listid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public int getStoreid() {
		return storeid;
	}
	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getListid() {
		return listid;
	}
	public void setListid(int listid) {
		this.listid = listid;
	}
	public OrderList(int id, int quantity, int foodid, int storeid, String msg, int state, int listid) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.foodid = foodid;
		this.storeid = storeid;
		this.msg = msg;
		this.state = state;
		this.listid = listid;
	}
	public OrderList() {
		super();
	}
	@Override
	public String toString() {
		return "OrderList [id=" + id + ", quantity=" + quantity + ", foodid=" + foodid + ", storeid=" + storeid
				+ ", msg=" + msg + ", state=" + state + ", listid=" + listid + "]";
	}
	

}

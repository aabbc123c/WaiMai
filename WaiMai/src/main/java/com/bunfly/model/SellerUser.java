package com.bunfly.model;

public class SellerUser {
	private int id;
	private String username;
	private String password;
	private String phonenumber;
	private String email;
	private String peoplename;
	private String storename;
	private String storenumber;
	private String storepicture;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPeoplename() {
		return peoplename;
	}
	public void setPeoplename(String peoplename) {
		this.peoplename = peoplename;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public String getStorenumber() {
		return storenumber;
	}
	public void setStorenumber(String storenumber) {
		this.storenumber = storenumber;
	}
	public String getStorepicture() {
		return storepicture;
	}
	public void setStorepicture(String storepicture) {
		this.storepicture = storepicture;
	}
	public SellerUser(int id, String username, String password, String phonenumber, String email, String peoplename,
			String storename, String storenumber, String storepicture) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		this.email = email;
		this.peoplename = peoplename;
		this.storename = storename;
		this.storenumber = storenumber;
		this.storepicture = storepicture;
	}
	public SellerUser() {
		super();
	}
	@Override
	public String toString() {
		return "SellerUser [id=" + id + ", username=" + username + ", password=" + password + ", phonenumber="
				+ phonenumber + ", email=" + email + ", peoplename=" + peoplename + ", storename=" + storename
				+ ", storenumber=" + storenumber + ", storepicture=" + storepicture + "]";
	}
}

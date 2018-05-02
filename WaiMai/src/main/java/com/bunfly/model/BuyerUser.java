package com.bunfly.model;

public class BuyerUser {
	private int id;
	private String username;
	private String password;
	private String phonenumber;
	private String email;
	private String peoplename;
	private int age;
	private String headpicture;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHeadpicture() {
		return headpicture;
	}
	public void setHeadpicture(String headpicture) {
		this.headpicture = headpicture;
	}
	public BuyerUser(int id, String username, String password, String phonenumber, String email, String peoplename,
			int age, String headpicture) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phonenumber = phonenumber;
		this.email = email;
		this.peoplename = peoplename;
		this.age = age;
		this.headpicture = headpicture;
	}
	
	public BuyerUser() {
		super();
	}
	@Override
	public String toString() {
		return "BuyerUser [id=" + id + ", username=" + username + ", password=" + password + ", phonenumber="
				+ phonenumber + ", email=" + email + ", peoplename=" + peoplename + ", age=" + age + ", headpicture="
				+ headpicture + "]";
	}
	
}

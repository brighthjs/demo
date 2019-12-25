package com.example.demo.entity;

public class User {
	private Integer uId;      // 主键ID
	private String uName;  // 用户名
	private String uPassword;  // 用户密码
	
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getUserName() {
		return uName;
	}
	public void setUserName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return uPassword;
	}
	public void setPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	
	
}

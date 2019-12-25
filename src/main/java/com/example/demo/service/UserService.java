package com.example.demo.service;

public interface UserService {
	// 通过用户ID查询用户信息
	public boolean authentication(int uId, String password);
}

package com.example.demo.dao;

import com.example.demo.entity.User;

public interface UserDao {
	// 通过用户ID查询用户信息
	public User queryUserById(int uId);

}

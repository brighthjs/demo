package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean authentication(int uId, String password) {
		if(uId > 1 && password != null && !"".equals(password)) {
			try{
				User user = userDao.queryUserById(uId);
				if(user.getPassword().equals(password))
					return true;
				else throw new RuntimeException("Password is incorrect!");
			}
			catch (Exception e) {
				throw new RuntimeException("Fail to authenticate:"+e.getMessage());
			}
		}
		throw new RuntimeException("Invalid id or password");
	}

}

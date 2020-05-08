package com.example.demo.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/auth", method = RequestMethod.POST)
	private Map<String, Object> auth(@RequestBody User user){
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", userService.authentication(user.getuId(), user.getPassword()));
		return modelMap;
	}

	@GetMapping(value = "/test")
	public int test(){
		return 1;
	}
}

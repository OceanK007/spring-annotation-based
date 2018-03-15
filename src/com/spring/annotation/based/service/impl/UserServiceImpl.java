package com.spring.annotation.based.service.impl;

import org.springframework.stereotype.Service;

import com.spring.annotation.based.model.User;
import com.spring.annotation.based.service.UserService;

@Service
public class UserServiceImpl implements UserService 
{
	@Override
	public User getUserData() 
	{
		User u = new User();
		u.setName("Ocean");
		return u;
	}
}

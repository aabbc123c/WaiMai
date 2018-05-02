package com.bunfly.service.impl;

import org.springframework.stereotype.Service;

import com.bunfly.dao.IUserDao;
import com.bunfly.model.BuyerUser;
import com.bunfly.service.IUserService;

@Service
public class UserService implements IUserService {
	
	public IUserDao dao;
	
	public BuyerUser SelectUser(int i) {
		
		BuyerUser user = dao.SelectUser(i);
		
		return user;
	}
	
}

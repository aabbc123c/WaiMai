package com.bunfly.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bunfly.model.BuyerUser;
import com.bunfly.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserServlet {
	@Resource
	IUserService ser;
	@RequestMapping("/select")
	public String SelectUser(Model m){
		int i = 1;
		BuyerUser user = ser.SelectUser(i);
		System.out.println(user);
		m.addAttribute("msg", user.getUsername());
		return "index.jsp";
	}
	
}

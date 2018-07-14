package com.cmdi.check.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmdi.check.model.User;
import com.cmdi.check.service.api.IGoodService;
import com.cmdi.check.service.api.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IGoodService goodService;
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public  Map addUser(@RequestParam("username")String username,@RequestParam("password")String password){
		
		userService.add(username, password);
		
		goodService.add("xxx", 123);
		Map map = new HashMap();
		map.put("status", "ok");
		
		return map;
		
	}
	
	@RequestMapping(value="/getUserByName",method=RequestMethod.GET)
	@ResponseBody
	public Map  getUserByName(@RequestParam("username") String username) {
		
		Map map = new HashMap<String, Object>();
		List<User> list = userService.getUserByName(username);
		map.put("data",list );
		return map;
		
	}
}

package com.ksoft.bdqservices.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ksoft.bdqservices.models.Role;
import com.ksoft.bdqservices.models.UserDetail;
import com.ksoft.bdqservices.services.ManageUserService;

@RestController
public class ManageUserController {
	
	@Autowired
	private ManageUserService manageUserService;
	
	@RequestMapping(value="/createUser",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserDetail createUser(@RequestBody UserDetail userDetail){
		return manageUserService.createUser(userDetail);
		//return null;
	}
	
	@RequestMapping(value="/createRole",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public Role createRole(@RequestBody Role role){
		return   manageUserService.createRole(role);
		//return null;ss
	}
	
	@RequestMapping(value="/validateLogin",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserDetail validateLogin(@RequestBody UserDetail userDetail){
		
		return manageUserService.validateLogin(userDetail);
		//return null;
	}

}

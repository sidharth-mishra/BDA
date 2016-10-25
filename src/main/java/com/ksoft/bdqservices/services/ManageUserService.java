package com.ksoft.bdqservices.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.ksoft.bdqservices.models.Role;
import com.ksoft.bdqservices.models.UserDetail;
import com.ksoft.bdqservices.repositories.ManageUserRepository;
import com.ksoft.bdqservices.repositories.RoleRepository;

@Service
public class ManageUserService {

	@Autowired
	private ManageUserRepository manageUserRepository;
	@Autowired
	private RoleRepository roleRepository;

	public UserDetail createUser(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return manageUserRepository.save(userDetail);
	}

	public Role createRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}
	
	public UserDetail validateLogin(UserDetail userDetail) {
		// TODO Auto-generated method stub
		
		List<UserDetail> userDetList=manageUserRepository.findByEmailIdAndPassword(
				userDetail.emailId,userDetail.password);
		if(userDetList.size()>0){
		return userDetList.get(0);
		}else{
		return null;
		}
	}
}

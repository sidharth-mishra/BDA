package com.ksoft.bdqservices.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Role {
	
	@Id
	@SequenceGenerator(name="role_seq", initialValue=1, allocationSize=20)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="role_seq")
	@Column(name="roleId")
	public int roleId;
	public String roleName;;
	public String roleDesc;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	
	/*public List<UserDetail> getUserList() {
		return userList;
	}
	public void setUserList(List<UserDetail> userList) {
		this.userList = userList;
	}*/


	

}

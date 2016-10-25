package com.ksoft.bdqservices.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
             
@Entity
public class UserDetail {

	@Id
	@SequenceGenerator(name="user_details_seq", initialValue=1, allocationSize=20)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="user_details_seq")
	public int userId;
	public String emailId;
	public String password;
	public String firstname;
	public String lastname;
	@ManyToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "roleId",referencedColumnName="roleId")
	public Role role;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}

package com.ksoft.bdqservices.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ksoft.bdqservices.models.UserDetail;
import java.lang.String;
import java.util.List;

public interface ManageUserRepository extends CrudRepository<UserDetail, Serializable>{

	List<UserDetail> findByEmailIdAndPassword(String emailid,String password);
}

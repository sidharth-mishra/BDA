package com.ksoft.bdqservices.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ksoft.bdqservices.models.Role;
import com.ksoft.bdqservices.models.UserDetail;

public interface RoleRepository extends CrudRepository<Role, Serializable>{


}

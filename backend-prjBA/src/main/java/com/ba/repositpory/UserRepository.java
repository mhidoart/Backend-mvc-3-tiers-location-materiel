package com.ba.repositpory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ba.models.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	User findByEmail(String email);
	User findByUsernameAndPasword(String userName , String password);
	User findByUsername(String userName);
	
}

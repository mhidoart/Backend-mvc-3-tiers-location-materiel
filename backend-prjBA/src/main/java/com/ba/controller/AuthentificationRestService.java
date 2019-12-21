package com.ba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ba.models.User;
import com.ba.repositpory.UserRepository;




@RestController
@CrossOrigin("*")
public class AuthentificationRestService {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/signIn",method=RequestMethod.POST)
	public boolean signIn(@RequestBody String email , String password) {
		User u = userRepository.findByEmail(email);
		return u.getPasword().equals(password);
	}
	
	
}

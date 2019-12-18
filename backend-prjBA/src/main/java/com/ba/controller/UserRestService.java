package com.ba.controller;

import java.security.Principal;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ba.models.Role;
import com.ba.models.User;
import com.ba.repositpory.DepartementRepository;
import com.ba.repositpory.RoleRepository;



@RestController
@CrossOrigin("*")
public class UserRestService {

	@Autowired
	private com.ba.repositpory.UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private DepartementRepository departementRepository;
	
	@RequestMapping(value="/getUserById/{id}",method=RequestMethod.GET)
	public Optional<User> getUserById(@PathVariable Integer id){
		return userRepository.findById(id);
	}
	@RequestMapping(value="/changeRole/{id}",method=RequestMethod.PUT)
	public boolean changeRole(@PathVariable Integer id , @RequestBody String role){
		Optional<User> user =  userRepository.findById(id);
		List<Role> r = roleRepository.findByName(role);
		user.get().setRoles(r);
		userRepository.save(user.get());
		return true;
		
	}
	@RequestMapping(value="/Users",method=RequestMethod.GET)
	public List<User> getAllUsers(){
		
		return userRepository.findAll();
	}
	
	@RequestMapping(value="/AddUser",method=RequestMethod.POST)
	public boolean AddUser(@RequestBody User user) {
		System.out.println(user.getEmail());
		System.out.println(user.getPasword());
		List<Role> r = roleRepository.findByName("ROLE_USER");
		System.out.println("role " + r);
		user.setRoles(r);
		departementRepository.save(user.getDepartement());
		userRepository.save(user);
		return true;
	}
	
	
	@RequestMapping(value="/delUser/{id}",method=RequestMethod.DELETE)
	public boolean delUser(@PathVariable Integer id) {
		userRepository.deleteById(id);
		 return true;
	}
	
	@RequestMapping(value="/updateUser/{id}",method=RequestMethod.PUT)
	public User updateUser(@PathVariable Integer id, @RequestBody User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public boolean login(@RequestBody User user) {
		System.out.println(user);
		User u = userRepository.findByUsernameAndPasword(user.getUsername() , user.getPasword());
		if(u==null) {
			return false;
		}
		else {
			return user.getUserName().equals(u.getUsername()) && user.getPasword().equals(user.getPasword());
		}

		
	}
	
	@RequestMapping(value="/getUser",method=RequestMethod.POST)
	public boolean getUser(@RequestBody String username) {
		
		User u = userRepository.findByUsername(username );
		if(u==null) {
			return false;
		}
		else {
			return true;
		}

	}
	

	
	@RequestMapping("/user")
    public User user(HttpServletRequest request) {
		System.out.println("here");
        String authToken = request.getHeader("Authorization")
          .substring("Basic".length()).trim();
        System.out.println(new String(Base64.getDecoder().decode(authToken)).split(":")[0]);
        return userRepository.findByUsernameAndPasword(  new String(Base64.getDecoder().decode(authToken)).split(":")[0],  new String(Base64.getDecoder()  .decode(authToken)).split(":")[1]);
    }
}

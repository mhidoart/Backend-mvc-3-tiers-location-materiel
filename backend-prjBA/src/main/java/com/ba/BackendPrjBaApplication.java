package com.ba;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ba.models.PC;
import com.ba.models.Printer;
import com.ba.models.Role;
import com.ba.repositpory.RessourceRepository;
import com.ba.repositpory.RoleRepository;
import com.ba.repositpory.UserRepository;



@CrossOrigin("*")
@ComponentScan(basePackages= {"com.ba.controller"})
@SpringBootApplication( )
public class BackendPrjBaApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	RessourceRepository ressourceRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendPrjBaApplication.class, args);


	}
	@Override
	public void run(String... args) throws Exception {

		List<Role>roles = roleRepository.findAll();
		
		if(roles.size() == 0)
		{
			Role r1 = new Role((long) 1, "ROLE_ADMIN");
			Role r2 = new Role((long) 2, "ROLE_USER");
			Role r3 = new Role((long) 3, "ROLE_FOURNISSEUR");
			roleRepository.save(r1); roleRepository.save(r2);	roleRepository.save(r3);	
		}
		
		//ressourceRepository.save(new PC("DELL", "8G", "i5", "HDD"));
	}

}

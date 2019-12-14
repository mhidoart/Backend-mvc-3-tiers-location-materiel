package com.ba.repositpory;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ba.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	List<Role> findByName(String nameRole);
}

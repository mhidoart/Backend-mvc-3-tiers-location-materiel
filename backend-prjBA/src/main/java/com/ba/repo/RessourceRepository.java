package com.ba.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ba.models.PC;
import com.ba.models.Ressource;

@Repository
public interface RessourceRepository extends JpaRepository<Ressource, Integer>{
	@Query(value = "SELECT * FROM ressource c WHERE c.dtype = ?1 AND c.id = ?2", nativeQuery = true)
	Ressource findByDtype(String type,int id);
	
	@Query(value = "SELECT * FROM ressource c WHERE c.dtype = ?1", nativeQuery = true)
	List<Ressource> findAllByDtype(String type);
	
	
}

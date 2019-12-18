package com.ba.repositpory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ba.models.Besoin;
import com.ba.models.Ressource;
@Repository
public interface BesoinRepository extends JpaRepository<Besoin, Integer>{
	@Query(value = "SELECT * FROM besoin c WHERE c.dtype = ?1 AND c.id = ?2", nativeQuery = true)
	Besoin findByDtype(String type,int id);
	
	@Query(value = "SELECT * FROM besoin c WHERE c.dtype = ?1", nativeQuery = true)
	List<Besoin> findAllByDtype(String type);
}

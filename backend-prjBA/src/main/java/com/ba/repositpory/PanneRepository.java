package com.ba.repositpory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ba.models.Panne;
@Repository
public interface PanneRepository extends JpaRepository<Panne, Integer>{
	@Query(value = "SELECT * FROM panne c WHERE  c.constat_id = ?1", nativeQuery = true)
	Optional<Panne> findPanneByConstat(int idConstat);
	
	@Query(value = "SELECT * FROM panne c WHERE  c.ressource_id = ?1", nativeQuery = true)
	Optional<Panne> findPanneByRessource(int idRessource);
}

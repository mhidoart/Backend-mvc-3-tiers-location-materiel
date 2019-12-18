package com.ba.repositpory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ba.models.Besoin;
import com.ba.models.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer>{
	@Query(value = "SELECT c FROM user,departement c WHERE c.id = user.departement_id AND user.id = ?1", nativeQuery = true)
	Departement findByDtype(int idUser);
}

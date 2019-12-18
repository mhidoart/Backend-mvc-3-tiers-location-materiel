package com.ba.repositpory;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ba.models.Commande;
import com.ba.models.Offre;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer>{
	@Query(value = "SELECT * FROM commande c WHERE  c.offre_id = ?1", nativeQuery = true)
	Optional<Commande> findCommandeByOffre(int idOffre);
}

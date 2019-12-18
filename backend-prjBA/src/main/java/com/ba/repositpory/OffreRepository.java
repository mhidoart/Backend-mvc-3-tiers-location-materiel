package com.ba.repositpory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ba.models.Besoin;
import com.ba.models.Offre;
@Repository
public interface OffreRepository extends JpaRepository<Offre, Integer> {
	@Query(value = "SELECT * FROM offre c WHERE  c.offre_fournisseur_id = ?1", nativeQuery = true)
	List<Offre> findOffreByDemandeOffre(int idDemandeOffre);
	
	@Query(value = "SELECT * FROM offre c WHERE  c.fournisseur_id = ?1", nativeQuery = true)
	List<Offre> findOffreByFournisseur(int idFournisseur);
}

package com.ba.repositpory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.models.Offre;
@Repository
public interface OffreRepository extends JpaRepository<Offre, Integer> {

}

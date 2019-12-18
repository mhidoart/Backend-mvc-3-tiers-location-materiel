package com.ba.repositpory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.models.DemandeOffre;
@Repository
public interface DemandeOffreRepository extends JpaRepository<DemandeOffre,Integer>{

}

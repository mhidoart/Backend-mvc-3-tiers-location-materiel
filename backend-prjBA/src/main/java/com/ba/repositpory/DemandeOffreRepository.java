package com.ba.repositpory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ba.models.Besoin;
import com.ba.models.DemandeOffre;
@Repository
public interface DemandeOffreRepository extends JpaRepository<DemandeOffre,Integer>{

}

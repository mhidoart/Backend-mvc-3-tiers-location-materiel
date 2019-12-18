package com.ba.repositpory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.models.Commande;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer>{

}

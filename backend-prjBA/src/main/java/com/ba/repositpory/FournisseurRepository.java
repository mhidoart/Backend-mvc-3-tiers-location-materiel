package com.ba.repositpory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ba.models.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {

}

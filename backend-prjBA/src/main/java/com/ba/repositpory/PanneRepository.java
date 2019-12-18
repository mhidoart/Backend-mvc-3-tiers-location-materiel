package com.ba.repositpory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.models.Panne;
@Repository
public interface PanneRepository extends JpaRepository<Panne, Integer>{

}

package com.ba.repositpory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ba.models.Constat;
@Repository
public interface ConstatRepository extends JpaRepository<Constat, Integer>{

}

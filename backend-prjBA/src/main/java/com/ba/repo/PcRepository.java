package com.ba.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ba.models.PC;

@Repository
public interface PcRepository extends JpaRepository<PC, Integer>{

}

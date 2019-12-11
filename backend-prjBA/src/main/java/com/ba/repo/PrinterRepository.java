package com.ba.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ba.models.PC;
import com.ba.models.Printer;

@Repository
public interface PrinterRepository extends JpaRepository<Printer, Integer>{

}

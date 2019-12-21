package com.ba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ba.models.Departement;
import com.ba.models.Role;
import com.ba.models.User;
import com.ba.repositpory.DepartementRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("departement")
public class DepartementRestService {
	@Autowired
	DepartementRepository depRepo;
	@RequestMapping(value="/getAllDepartement",method=RequestMethod.GET)
	public List<Departement> getAllDepartement(){
		return depRepo.findAll();
	}
	@RequestMapping(value="/getDepartementById/{id}",method=RequestMethod.GET)
	public Optional<Departement> getDepartementById(@PathVariable Integer id){
		return depRepo.findById(id);
	}
	@RequestMapping(value="/addDepartement",method=RequestMethod.POST)
	public boolean addDepartement(@RequestBody Departement dep) {
		if(depRepo.save(dep) != null) {
			return true;
		}
		return false;
	}
	@RequestMapping(value="/deleteDepartement/{id}",method=RequestMethod.DELETE)
	public boolean deleteDepartement(@PathVariable Integer id) {
		depRepo.deleteById(id);
		 return true;
	}
	@RequestMapping(value="/updateDepartement/{id}",method=RequestMethod.PUT)
	public Departement updateDepartement(@PathVariable Integer id, @RequestBody Departement dep) {
		dep.setId(id);
		return depRepo.save(dep);
	}
}

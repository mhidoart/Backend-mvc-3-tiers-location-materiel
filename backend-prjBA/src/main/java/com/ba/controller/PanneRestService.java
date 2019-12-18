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

import com.ba.models.Panne;
import com.ba.repositpory.PanneRepository;



@RestController
@RequestMapping("panne")
@CrossOrigin("*")
public class PanneRestService {
	@Autowired
	PanneRepository repo;
	

	@RequestMapping(value="/getAllPanne",method=RequestMethod.GET)
	public List<Panne> getAllPanne(){
		return repo.findAll();
	}
	@RequestMapping(value="/getPanneById/{id}",method=RequestMethod.GET)
	public Optional<Panne> getPanneById(@PathVariable Integer id){
		return repo.findById(id);
	}
	@RequestMapping(value="/addPanne",method=RequestMethod.POST)
	public boolean addPanne(@RequestBody Panne dep) {
		if(repo.save(dep) != null) {
			return true;
		}
		return false;
	}
	@RequestMapping(value="/deletePanne/{id}",method=RequestMethod.DELETE)
	public boolean deletePanne(@PathVariable Integer id) {
		repo.deleteById(id);
		return true;
	}
	@RequestMapping(value="/updatePanne/{id}",method=RequestMethod.PUT)
	public Panne updatePanne(@PathVariable Integer id, @RequestBody Panne dep) {
		dep.setId(id);
		return repo.save(dep);
	}

	

}

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

import com.ba.models.Commande;
import com.ba.models.Constat;
import com.ba.repositpory.ConstatRepository;

@RestController
@RequestMapping("constat")
@CrossOrigin("*")
public class ConstatRestService {
	@Autowired
	ConstatRepository repo;
	

	@RequestMapping(value="/getAllConstats",method=RequestMethod.GET)
	public List<Constat> getAllConstats(){
		return repo.findAll();
	}
	@RequestMapping(value="/getConstatById/{id}",method=RequestMethod.GET)
	public Optional<Constat> getCommandeById(@PathVariable Integer id){
		return repo.findById(id);
	}
	@RequestMapping(value="/addConstat",method=RequestMethod.POST)
	public boolean addConstat(@RequestBody Constat dep) {
		if(repo.save(dep) != null) {
			return true;
		}
		return false;
	}
	@RequestMapping(value="/deleteConstat/{id}",method=RequestMethod.DELETE)
	public boolean deleteConstat(@PathVariable Integer id) {
		repo.deleteById(id);
		return true;
	}
	@RequestMapping(value="/updateConstat/{id}",method=RequestMethod.PUT)
	public Constat updateConstat(@PathVariable Integer id, @RequestBody Constat dep) {
		dep.setId(id);
		return repo.save(dep);
	}


}

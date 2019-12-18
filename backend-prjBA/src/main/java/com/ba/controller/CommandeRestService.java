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
import com.ba.repositpory.CommandeRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("commande")
public class CommandeRestService {
	@Autowired
	CommandeRepository repo ;

	@RequestMapping(value="/getAllCommands",method=RequestMethod.GET)
	public List<Commande> getAllCommands(){
		return repo.findAll();
	}
	@RequestMapping(value="/getCommandeById/{id}",method=RequestMethod.GET)
	public Optional<Commande> getCommandeById(@PathVariable Integer id){
		return repo.findById(id);
	}
	@RequestMapping(value="/addCommande",method=RequestMethod.POST)
	public boolean addCommande(@RequestBody Commande dep) {
		if(repo.save(dep) != null) {
			return true;
		}
		return false;
	}
	@RequestMapping(value="/deleteCommande/{id}",method=RequestMethod.DELETE)
	public boolean deleteCommande(@PathVariable Integer id) {
		repo.deleteById(id);
		return true;
	}
	@RequestMapping(value="/updateCommande/{id}",method=RequestMethod.PUT)
	public Commande updateCommande(@PathVariable Integer id, @RequestBody Commande dep) {
		dep.setId(id);
		return repo.save(dep);
	}

}

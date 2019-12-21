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

import com.ba.models.Fournisseur;
import com.ba.repositpory.FournisseurRepository;

@CrossOrigin("*")
@RequestMapping("fournisseur")
@RestController
public class FournisseurRestService {
	@Autowired
	FournisseurRepository fournisseurRepo;
	
	@RequestMapping(value="/getAllfournisseur",method=RequestMethod.GET)
	public List<Fournisseur> getAllfournisseur(){
		return fournisseurRepo.findAll();
	}
	@RequestMapping(value="/getfournisseurById/{id}",method=RequestMethod.GET)
	public Optional<Fournisseur> getfournisseurById(@PathVariable Integer id){
		return fournisseurRepo.findById(id);
	}
	@RequestMapping(value="/addFournisseur",method=RequestMethod.POST)
	public boolean addFournisseur(@RequestBody Fournisseur dep) {
		if(fournisseurRepo.save(dep) != null) {
			return true;
		}
		return false;
	}
	@RequestMapping(value="/deleteFournisseur/{id}",method=RequestMethod.DELETE)
	public boolean deleteFournisseur(@PathVariable Integer id) {
		fournisseurRepo.deleteById(id);
		 return true;
	}
	@RequestMapping(value="/updateFournisseur/{id}",method=RequestMethod.PUT)
	public Fournisseur updateFournisseur(@PathVariable Integer id, @RequestBody Fournisseur fournisseur) {
		fournisseur.setId(id);
		return fournisseurRepo.save(fournisseur);
	}
	
}

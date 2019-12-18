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

import com.ba.models.Besoin;
import com.ba.models.DemandeOffre;
import com.ba.repositpory.ConstatRepository;
import com.ba.repositpory.DemandeOffreRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("demandeOffre")
public class DemandeOffreRestService {
	@Autowired
	DemandeOffreRepository repo;
	

	@RequestMapping(value="/getAllDemandeOffre",method=RequestMethod.GET)
	public List<DemandeOffre> getAllDemandeOffre(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/getDemandeOffreById/{id}",method=RequestMethod.GET)
	public Optional<DemandeOffre> getDemandeOffreById(@PathVariable Integer id){
		return repo.findById(id);
	}
	@RequestMapping(value="/addDemandeOffre",method=RequestMethod.POST)
	public boolean addDemandeOffre(@RequestBody DemandeOffre dep) {
		if(repo.save(dep) != null) {
			return true;
		}
		return false;
	}
	@RequestMapping(value="/deleteDemandeOffre/{id}",method=RequestMethod.DELETE)
	public boolean deleteDemandeOffre(@PathVariable Integer id) {
		repo.deleteById(id);
		return true;
	}
	@RequestMapping(value="/updateDemandeOffre/{id}",method=RequestMethod.PUT)
	public DemandeOffre updateConstat(@PathVariable Integer id, @RequestBody DemandeOffre dep) {
		dep.setId(id);
		return repo.save(dep);
	}
	@RequestMapping(value="/valide/{id}/{flag}",method=RequestMethod.PUT)
	public DemandeOffre valide(@PathVariable Integer id,@PathVariable boolean flag, @RequestBody DemandeOffre dep) {
		dep.setId(id);
		dep.setFlag(flag);
		return repo.save(dep);
	}
	

}

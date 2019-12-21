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
import com.ba.models.BesoinPC;
import com.ba.models.BesoinPrinter;
import com.ba.repositpory.BesoinRepository;



@RestController
@RequestMapping("besoin")
@CrossOrigin("*")
public class BesoinRestService {
	@Autowired
	BesoinRepository repo;
	
	@RequestMapping(value="/getBesoinPCByOffre/{id}",method=RequestMethod.GET) //les besoinPC qui appartien a une demandeOffre
	public List<Besoin> getBesoinPCByOffre(@PathVariable Integer idDemandeOffre){
		return repo.findBesoinByOffre("BesoinPC", idDemandeOffre);
	}
	@RequestMapping(value="/getBesoinPrinterByOffre/{id}",method=RequestMethod.GET) //les besoinPrinter qui appartien a une demandeOffre
	public List<Besoin> getBesoinPrinterByOffre(@PathVariable Integer idDemandeOffre){
		return repo.findBesoinByOffre("BesoinPrinter", idDemandeOffre);
	}
	@RequestMapping(value="/getBesoinPCByID/{id}",method=RequestMethod.GET)
	public BesoinPC getBesoinByPC(@PathVariable Integer id){
		return (BesoinPC) repo.findByDtype("BesoinPC", id);
	}
	@RequestMapping(value="/getAllBesoinPC",method=RequestMethod.GET)
	public List<Besoin> getAllBesoinPC(){
		return repo.findAllByDtype("BesoinPC");
	}
	@RequestMapping(value="/getBesoinPrinterByID/{id}",method=RequestMethod.GET)
	public BesoinPrinter getBesoinPrinterByID(@PathVariable Integer id){
		return (BesoinPrinter) repo.findByDtype("BesoinPrinter", id);
	}
	@RequestMapping(value="/getAllBesoinPrinter",method=RequestMethod.GET)
	public List<Besoin> getAllBesoinPrinter(){
		return repo.findAllByDtype("BesoinPrinter");
	}
	@RequestMapping(value="/getAllBesoin",method=RequestMethod.GET)
	public List<Besoin> getAllBesoin(){
		return repo.findAll();
	}
	@RequestMapping(value="/getBesoinById/{id}",method=RequestMethod.GET)
	public Optional<Besoin> getBesoinById(@PathVariable Integer id){
		return repo.findById(id);
	}
	
	
	@RequestMapping(value="/addBesoinPC",method=RequestMethod.POST)
	public boolean addBesoinPC(@RequestBody BesoinPC besoinPC) {
		if(repo.save(besoinPC) != null) {
			return true;
		}
		return false;
	}
	
	@RequestMapping(value="/addBesoinPrinter",method=RequestMethod.POST)
	public boolean addBesoinPrinter(@RequestBody BesoinPrinter besoinPrinter) {
		if(repo.save(besoinPrinter) != null) {
			return true;
		}
		return false;
	}
	
	
	@RequestMapping(value="/deleteBesoinPc/{id}",method=RequestMethod.DELETE)
	public boolean deleteBesoinPc(@PathVariable Integer id) {
		repo.deleteById(id);
		return true;
	}
	@RequestMapping(value="/deleteBesoinPrinter/{id}",method=RequestMethod.DELETE)
	public boolean deleteBesoinPrinter(@PathVariable Integer id) {
		repo.deleteById(id);
		return true;
	}
	@RequestMapping(value="/updateBesoin/{id}",method=RequestMethod.PUT)
	public Besoin updateBesoinPc(@PathVariable Integer id, @RequestBody Besoin dep) {
		dep.setId(id);
		return repo.save(dep);
	}
	@RequestMapping(value="/valide/{id}/{flag}",method=RequestMethod.PUT)
	public Besoin valide(@PathVariable Integer id,@PathVariable boolean flag, @RequestBody Besoin dep) {
		dep.setId(id);
		dep.setFlag(flag);
		return repo.save(dep);
	}

}

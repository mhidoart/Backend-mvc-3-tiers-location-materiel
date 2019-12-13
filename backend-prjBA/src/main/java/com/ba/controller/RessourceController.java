package com.ba.controller;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ba.models.PC;
import com.ba.models.Printer;
import com.ba.models.Ressource;
import com.ba.repo.PcRepository;
import com.ba.repo.PrinterRepository;
import com.ba.repo.RessourceRepository;
import com.mysql.cj.xdevapi.JsonArray;

@RestController
@CrossOrigin("*")
@RequestMapping("resources")
public class RessourceController {
	@Autowired 
	RessourceRepository resRepo;

/////   le pc
	@RequestMapping(value = "/computers/all", method = RequestMethod.GET)
	private List<Ressource> getAllPC(){

		return resRepo.findAllByDtype("PC");

	}

	@RequestMapping(value = "/computers/delete/{id}", method = RequestMethod.DELETE)
	private void delete(@PathVariable Integer id) {
		if( resRepo.findById(id) != null) {
			resRepo.deleteById(id);
		}
	}

	@RequestMapping(value = "/computers/add", method = RequestMethod.POST)
	private boolean addPC(@RequestBody PC pc){
		if( resRepo.save(pc) != null) {
			
			return true;
		}
		return false;
	
		
	}
	@RequestMapping(value = "/computers/addMany", method = RequestMethod.POST)
	private void addManyPc(@RequestBody List<PC> list ){
		if(list != null ) {
			for (PC pc : list) {
				System.out.println(this.addPC(pc));
			}
		}

	}

	@RequestMapping(value = "/computers/getByID/{id}", method = RequestMethod.GET)
	private PC getComputer(@PathVariable int id){
		return (PC) resRepo.findByDtype("PC",id);

	}
	
	
	//////////////////////////////////////////////////////////////////////       printers 
	@RequestMapping(value = "/printers/getByID/{id}", method = RequestMethod.GET)
	private Printer getPrinter(@PathVariable int id){

		return (Printer) resRepo.findByDtype("Printer",id);

	}
	@RequestMapping(value = "/printers/all", method = RequestMethod.GET)
	private List<Ressource> getAllPrinters(){
		resRepo.save(new Printer(0, "canon"));

		return  resRepo.findAllByDtype("Printer");

	}	
	@RequestMapping(value = "/printers/delete/{id}", method = RequestMethod.DELETE)
	private void deletePrinter(@PathVariable Integer id) {
		if( resRepo.findById(id) != null) {
			resRepo.deleteById(id);
		}
	}

	@RequestMapping(value = "/printers/add", method = RequestMethod.POST)
	private boolean addPrinter(@RequestBody Printer printer){
	
			if( resRepo.save(printer) != null) {
				return true;
			}
			return false;

		
	}
	@RequestMapping(value = "/printers/addMany", method = RequestMethod.POST)
	private void addManyPrinters(@RequestBody List<Printer> list ){
		if(list != null ) {
			for (Printer printer : list) {
				System.out.println(this.addPrinter(printer));
			}
		}

	}

}

package com.ba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ba.models.PC;
import com.ba.models.Ressource;
import com.ba.repo.PrinterRepository;
import com.ba.repo.RessourceRepository;

@RestController
@CrossOrigin("*")
public class RessourceController {
	@Autowired 
	RessourceRepository resRepo;

	@RequestMapping(value = "/resources/getByID/{id}", method = RequestMethod.GET)
	private Optional<Ressource> getRsources(@PathVariable int id){
		System.out.println("-----------------------------------------------------");
		return  resRepo.findById(id);

	}

	@RequestMapping(value = "/computers2/getByID/{id}", method = RequestMethod.GET)
	private List<PC> getComputer(@PathVariable int id){
		/* Ressource re = (resRepo.findById(id)).get();
		if(re.getCategorie().equals("PC")) {
			return re;
		}
		return null;
*/
		return resRepo.findByDtype("PC");

	}

}

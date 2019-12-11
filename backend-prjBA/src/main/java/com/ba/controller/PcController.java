package com.ba.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ba.models.PC;
import com.ba.repo.PcRepository;

@RestController
@CrossOrigin("*")
public class PcController {
	
	@Autowired
	PcRepository pcServices;
	@RequestMapping(value = "/computers/add", method = RequestMethod.POST)
	private void addPc(@RequestBody PC pc ){
		if( pcServices.findById(pc.getId()) != null) {
					  pcServices.save(pc);

		}

	}
	@RequestMapping(value = "/computers/addMany", method = RequestMethod.POST)
	private void addManyPc(@RequestBody List<PC> list ){
		if(list != null ) {
			 for (PC pc : list) {
				 pcServices.save(pc);
			}
		}

	}
	
	@RequestMapping(value = "/computers/getByID/{id}", method = RequestMethod.GET)
	private Optional<PC> getComputer(@PathVariable int id){
		return  pcServices.findById(id);

	}
	
	@RequestMapping(value = "/computers", method = RequestMethod.GET)
	private List<PC> getComputers(){
		return  pcServices.findAll();

	}
	@RequestMapping(value = "/computers/delete/{id}", method = RequestMethod.DELETE)
	private void delete(@PathVariable Integer id) {
		pcServices.deleteById(id);
	}

}

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

import com.ba.models.Printer;
import com.ba.repo.PrinterRepository;
import com.ba.repo.PrinterRepository;

@RestController
@CrossOrigin("*")
public class PrinterController {
	
	@Autowired
	PrinterRepository printerServices;
	@RequestMapping(value = "/printers/add", method = RequestMethod.POST)
	private void addPrinter(@RequestBody Printer printer ){
		if( printerServices.findById(printer.getId()) != null) {
					  printerServices.save(printer);

		}

	}
	@RequestMapping(value = "/printers/addMany", method = RequestMethod.POST)
	private void addManyPrinter(@RequestBody List<Printer> list ){
		if(list != null ) {
			 for (Printer printer : list) {
				 printerServices.save(printer);
			}
		}

	}
	
	@RequestMapping(value = "/printers/getByID/{id}", method = RequestMethod.GET)
	private Optional<Printer> getPrinter(@PathVariable int id){
		return  printerServices.findById(id);
		

	}
	
	@RequestMapping(value = "/printers", method = RequestMethod.GET)
	private List<Printer> getPrinters(){
		return  printerServices.findAll();

	}
	@RequestMapping(value = "/printers/delete/{id}", method = RequestMethod.DELETE)
	private void delete(@PathVariable Integer id) {
		printerServices.deleteById(id);
	}

}

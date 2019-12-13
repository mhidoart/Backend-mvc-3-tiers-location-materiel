package com.ba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ba.models.PC;
import com.ba.models.Printer;
import com.ba.repo.PcRepository;
import com.ba.repo.PrinterRepository;




// @SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
// @ComponentScan("com.esisa")
//@EnableAutoConfiguration
// @EnableJpaRepositories("com.esisa")

@CrossOrigin("*")
@ComponentScan(basePackages= {"com.ba.controller"})
//@SpringBootApplication()
@SpringBootApplication( )
public class BackendPrjBaApplication implements CommandLineRunner {
	@Autowired
	PcRepository pcRepository ;
	@Autowired 
	PrinterRepository printerRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BackendPrjBaApplication.class, args);


	}
	@Override
	public void run(String... args) throws Exception {
	/*	PC pc = new PC(0,1,"intel i5","4 gb","500 gb","BGP");
		pcRepository.save(pc);
		printerRepository.save(new Printer("pRINTER 55"));
		*/

	}

}

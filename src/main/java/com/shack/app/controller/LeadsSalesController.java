package com.shack.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shack.app.model.Leads;
import com.shack.app.model.Sales;
import com.shack.app.repository.LeadsRepository;
import com.shack.app.repository.SalesRepository;

@RestController
public class LeadsSalesController {
	
	@Autowired
	private LeadsRepository leadsRepository;
	
	@Autowired
	private SalesRepository salesRepository;
	
	 // Find all the leads
    @GetMapping("/leads")
    List<Leads> findAllLeads() {
        return leadsRepository.findAll();
    }
	
    // find all sales
    @GetMapping("/sales")
    List<Sales> findAllSales(){
    	return salesRepository.findAll();
    	
    }
    @PostMapping("/leads")
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    Leads newLeads(@RequestBody Leads newlead) {
        return leadsRepository.save(newlead);
    }
    // create new sales
    @PostMapping("/sales")
    //return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    Sales newSales(@RequestBody Sales newSalesRepository) {
        return salesRepository.save(newSalesRepository);
    }
    
    //find reports
    @GetMapping("/leads/{product}")
    public String getOpportunity(@PathVariable String product) {
    	
    	List<Leads> leads=leadsRepository.findAll();
        
        if(!(product.equals("false"))) {
        	
        	List<Sales> sales=salesRepository.findAll();
        	
        }
        
    	return "";
    }
}

package com.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.domain.Base_A;
import com.desafio.service.Base_A_Service;

@RestController
@RequestMapping("/basea")
public class Base_A_Controller {
	
	@Autowired
	private Base_A_Service base_A_Service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/id/{id}")
	public Base_A getById(@PathVariable("id") String id){
		return base_A_Service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cpf/{cpf}")
	public Base_A getByCpf(@PathVariable("cpf") String cpf){
		return base_A_Service.getByCpf(cpf);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAll")
	public Iterable<Base_A> getAll(){
		return base_A_Service.getAllBase();		
	}

}

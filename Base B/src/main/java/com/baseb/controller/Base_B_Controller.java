package com.baseb.controller;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baseb.domain.Base_B;
import com.baseb.service.Base_B_Service;

@RestController
@RequestMapping("/baseb")
public class Base_B_Controller {
	
	@Autowired
	public Base_B_Service base_B_Service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/new")
	public void insert(@RequestBody Base_B baseb){
		base_B_Service.insert(baseb);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public void update(@RequestBody Base_B baseb){
		base_B_Service.update(baseb);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/id/{id}")
	public Optional<Base_B> getById(@PathVariable("id") String id){
		return base_B_Service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getAll")
	public Iterable<Base_B> getAll(){
		return base_B_Service.getAll();
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void delete(@PathVariable("id") String id){
		base_B_Service.delete(id);
	}
}
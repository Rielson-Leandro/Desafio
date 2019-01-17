package com.basec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.basec.domain.Base_C;
import com.basec.service.Base_C_Service;

@Controller
@RequestMapping("/basec")
public class Base_C_Controller {
	
	@Autowired
	public Base_C_Service base_C_Service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/new")
	public void insert(@RequestBody Base_C basec){
		base_C_Service.insert(basec);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public void update(@RequestBody Base_C basec){
		base_C_Service.update(basec);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/id/{id}")
	public Base_C getById(@PathVariable("id") String id){
		return base_C_Service.findById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cpf/{cpf}")
	public Base_C getByCpf(@PathVariable("cpf") String cpf){
		return base_C_Service.findById(cpf);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void delete(@PathVariable("id") String id){
		base_C_Service.delete(id);
	}
}
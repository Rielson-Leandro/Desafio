package com.basec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basec.domain.Base_C;
import com.basec.repository.Base_C_Repository;

@Service
public class Base_C_Service {
	
	@Autowired
	private Base_C_Repository base_C_Repository;
	
	public void insert(Base_C basec){
		base_C_Repository.save(basec);
	}
	
	public List<Base_C> getAllBaseC(){
		return base_C_Repository.findAll();
	}
	
	public void update(Base_C basec){
		this.base_C_Repository.save(basec);
	}
	
	public void delete(String id){
		this.base_C_Repository.deleteById(id);
	}
	
	public List<Base_C> getAll(){
		return base_C_Repository.findAll();
	}
	
	public Base_C findById(String id){
		try {
			return this.base_C_Repository.findById(id).get();
		} catch (Exception e) {
			return null;
		}
	}
	
	public Base_C getByCpf(String cpf){
		return base_C_Repository.findByCpf(cpf);
	}

}

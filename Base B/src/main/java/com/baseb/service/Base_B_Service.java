package com.baseb.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baseb.domain.Base_B;
import com.baseb.repository.Base_B_Repository;

@Service
public class Base_B_Service {
	
	@Autowired
	private Base_B_Repository base_B_Repository;
	
	public void insert(Base_B baseb) {
		base_B_Repository.save(baseb);
	}
	
	public void update(Base_B baseb){
		this.base_B_Repository.save(baseb);
	}
	
	public void delete(String id){
		base_B_Repository.deleteById(id);
	}
	
	public Iterable<Base_B> getAll(){
		return base_B_Repository.findAll();
	}
	
	public Optional<Base_B> findByCpf(String cpf){
		try {
			return this.base_B_Repository.findByCpf(cpf);
		} catch (Exception e) {
			return null;
		}
	}
	
	public Optional<Base_B> findById(String id){
		try {
			return this.base_B_Repository.findById(id);
		} catch (Exception e) {
			return null;
		}
	}

}

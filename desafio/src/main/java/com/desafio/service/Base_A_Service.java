package com.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.domain.Base_A;
import com.desafio.repository.Base_A_Repository;

@Service
public class Base_A_Service {

	@Autowired
	private Base_A_Repository base_A_Repository;
	
	public Iterable<Base_A> getAllBase(){
		return base_A_Repository.findAll();
	}
	
	public Base_A getByCpf(String cpf){
		return this.base_A_Repository.findByCpf(cpf);
	}
	
	public Base_A findById(String id){
		try {
			return this.base_A_Repository.findById(id).get();
		} catch (Exception e) {
			return null;
		}
	}
}

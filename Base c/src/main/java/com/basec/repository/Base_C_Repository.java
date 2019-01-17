package com.basec.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.basec.domain.Base_C;

@Repository
public interface Base_C_Repository extends MongoRepository<Base_C, String>{
	
	public Optional<Base_C> findById(String id);
	
	public Base_C findByCpf(String cpf);
	

}

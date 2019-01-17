package com.desafio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.desafio.domain.Base_A;

@Repository
public interface Base_A_Repository extends MongoRepository<Base_A, String>{
	
	public Base_A findByCpf(String cpf);
	
	public Optional<Base_A> findById(String id);
	
	public List<Base_A> findByDividas(String id);

}

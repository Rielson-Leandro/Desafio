package com.baseb.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.baseb.domain.Base_B;

@Repository
public interface Base_B_Repository extends MongoRepository<Base_B, String>{
	
	Optional<Base_B> findById(String id);
	
	Optional<Base_B> findByCpf(String cpf);
	
	List<Base_B> findByBens(String bens);

}

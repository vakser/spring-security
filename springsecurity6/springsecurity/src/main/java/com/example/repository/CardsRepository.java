package com.example.repository;

import com.example.model.Cards;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CardsRepository extends CrudRepository<Cards, Long> {
	
	List<Cards> findByCustomerId(int customerId);

}

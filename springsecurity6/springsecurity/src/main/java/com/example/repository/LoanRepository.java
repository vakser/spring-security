package com.example.repository;

import com.example.model.Loans;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface LoanRepository extends CrudRepository<Loans, Long> {
	
	List<Loans> findByCustomerIdOrderByStartDateDesc(int customerId);

}

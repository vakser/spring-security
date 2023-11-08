package com.example.repository;

import com.example.model.AccountTransactions;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {
	
	List<AccountTransactions> findByCustomerIdOrderByTransactionDateDesc(int customerId);

}

package com.mayank.repository;

import com.mayank.entity.Expense;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    public List<Expense> findByItem(String item);

    @Query("Select e from Expense e where e.amount >= :amount")
    public List<Expense> fetchProductsWithPrice(@Param("amount") float amount);
}

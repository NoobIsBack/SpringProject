//package com.mayank;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//
////@ComponentScan
//@Repository
//public interface ExpenseRepository extends CrudRepository<Expense, Long> {
//    List<Expense> findByItem(String item);
////
////    @Query("SELECT e FROM Expense e WHERE e.amount >= :amount")
////    List<Expense> fetchProductsWithPrice(@Param("amount") float amount);
//}

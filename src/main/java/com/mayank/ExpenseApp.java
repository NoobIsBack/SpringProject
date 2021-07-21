package com.mayank;

import com.mayank.entity.EntityB;
import com.mayank.repository.EntityBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

//breakfast
//@EnableJpaRepositories(basePackages={"com.mayank.repository"})
//@SpringBootApplication()

//@ComponentScan("com.mayank")
//@SpringBootApplication(scanBasePackages = {
//        "com.mayank.test"
//})
//@ComponentScan(basePackages = {"com.mayank.test"})
//@EnableJpaRepositories(basePackages = "com.mayank.test")
@SpringBootApplication
public class ExpenseApp implements CommandLineRunner {

    @Autowired
    ExpenseRepository repository;
//
    @Autowired
    EntityBRepository entityBRepository;

    public static void main(String[] args) {
        SpringApplication.run(ExpenseApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        call mysql
        callMySql();

//        calling cassandra
//        EntityB temp = new EntityB("name", "desc");
//        entityBRepository.save(temp);
    }

    public void callMySql() {
        repository.save(new Expense("breakfast", 5));
        repository.save(new Expense("coffee", 21));
        repository.save(new Expense("chai", 15));
        repository.save(new Expense("daru", 12));
        repository.save(new Expense("maggie", 21));
        repository.save(new Expense("biscuit", 67));

        Iterable<Expense> iterator = repository.findAll();

        System.out.println("All items present for breakfast");
        iterator.forEach(item -> System.out.println(item));

        List<Expense> breakafast = repository.findByItem("breakfast");
        System.out.println("How much does the break fast cost");
        breakafast.forEach(item -> System.out.println(item));

//        List<Expense> expensiveItems = repository.fetchProductsWithPrice(200);
        System.out.println("Expensive Items: ");
//        expensiveItems.iterator(item -> System.out.println(item));
    }
}

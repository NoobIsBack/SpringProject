package com.mayank;

import org.springframework.core.GenericTypeResolver;
import sun.jvm.hotspot.memory.Generation;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
//@Tab
//@Entity
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String item;

    private double amount;

    public Expense(String item, double amount) {
        this.item = item;
        this.amount = amount;
    }

    public Expense() {
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", amount=" + amount +
                '}';
    }

//    @javax.persistence.Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return amount;
    }

    public void setPrice(double price) {
        this.amount = price;
    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
}

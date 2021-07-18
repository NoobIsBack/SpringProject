package com.mayank.entity;

import org.springframework.core.GenericTypeResolver;
import org.springframework.data.annotation.Id;
import sun.jvm.hotspot.memory.Generation;

import javax.annotation.Generated;

//@Entity
public class Expense {
    @Id
//    @Generated()
    private Long id;

    private String item;

    private double price;

    public Expense(String item, double price) {
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.mayank.controller;

import com.mayank.entity.EntityB;
import com.mayank.repository.EntityBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entityB")
public class AppController {
    @Autowired
    EntityBRepository entityBRespository;

    /**
     * Stores the given entityA in Cassandra
     *
     * @return boolean to indicate status of operation
     */
    @GetMapping("/save")
    public Boolean saveNewEntityAHandler(
            @RequestParam String name, @RequestParam String description) {
        entityBRespository.insert(new EntityB(name, description));
        return true;
    }

}

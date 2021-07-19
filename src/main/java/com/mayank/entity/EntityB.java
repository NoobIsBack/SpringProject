package com.mayank.entity;

//import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

//@Data
@Table("EntityB")
public class EntityB {
    @Column
    @PrimaryKey
    private String name;
    @Column private String description;

    protected EntityB() {}

    public EntityB(
            String name,
            String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

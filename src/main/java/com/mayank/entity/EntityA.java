package com.mayank.entity;

import org.springframework.data.cassandra.core.mapping.*;

@Table("EntityA")
public class EntityA {
    @Column
    @PrimaryKey
    private String name;

    @Column private String description;

    //User-defined type
    @Frozen
    @Column
//    @CassandraType(type = DataType.Name.UDT, userTypeName = "identifier")
    private Identifier entityIdentifier;


    protected EntityA() {}

    public EntityA(
            String name,
            String description,
            Identifier entityIdentifier) {
        this.name = name;
        this.description = description;
        this.entityIdentifier = entityIdentifier;
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

    public Identifier getEntityIdentifier() {
        return entityIdentifier;
    }

    public void setEntityIdentifier(Identifier entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }


}

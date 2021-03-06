//package com.mayank.entity;
//
//import org.springframework.data.cassandra.core.cql.Ordering;
//import org.springframework.data.cassandra.core.mapping.PrimaryKey;
//import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
//
//import java.io.Serializable;
//import java.time.LocalDateTime;
//import java.util.UUID;
//
//import static org.springframework.data.cassandra.core.cql.Ordering.DESCENDING;
//import static org.springframework.data.cassandra.core.cql.PrimaryKeyType.PARTITIONED;
//
//public class PersonKey implements Serializable {
//    @PrimaryKeyColumn(name = "first_name", type = PARTITIONED)
//    private String firstName;
//
//    @PrimaryKeyColumn(name = "date_of_birth", ordinal = 0)
//    private LocalDateTime dateOfBirth;
//
//    @PrimaryKeyColumn(name= "person_id", ordinal = 1, ordering = DESCENDING)
//    private UUID id;
//
//    public PersonKey(final String firstName, LocalDateTime dateOfBirth, UUID id) {
//        this.firstName = firstName;
//        this.dateOfBirth = dateOfBirth;
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public LocalDateTime getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(LocalDateTime dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//}

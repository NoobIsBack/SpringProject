package com.mayank.repository;

import com.mayank.entity.Person;
import com.mayank.entity.PersonKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface PersonRepository extends CassandraRepository<Person, PersonKey> {
    List<Person> findByKeyFirstName(final String firstName);

    List<Person> findByKeyFirstNameAndKeyDateOfBirthGreaterThan(final String firstName, final LocalDateTime dateOfBirth) ;

    @Query(allowFiltering = true)
    List<Person> findByLastName(final String lastName);
}

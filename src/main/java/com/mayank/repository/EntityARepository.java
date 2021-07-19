package com.mayank.repository;

import com.mayank.entity.EntityA;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityARepository extends CassandraRepository<EntityA, String> {
}

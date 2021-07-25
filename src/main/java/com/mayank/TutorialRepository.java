package com.mayank;

import com.mayank.Tutorial;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TutorialRepository extends CassandraRepository<Tutorial, UUID> {
    @AllowFiltering
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);

}
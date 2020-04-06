package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonRepository extends Neo4jRepository<Person, Long> {

    @Query("Match(p:Person)-[b:HAS_SUBMITTED]-(q:Questionnaire) where $sym in q.symptoms  RETURN p")
    List<Person> findPeopleWithSymptom(String sym);
}

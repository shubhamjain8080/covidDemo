package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonRespository extends Neo4jRepository<Person, Long> {
     List<Person> findByName(String name);
}

package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Questionnaire;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.lang.reflect.Member;
import java.util.List;

public interface QuestionnaireRepository extends Neo4jRepository<Questionnaire, Long> {
    List<Member> findByIdFromFrontEnd(String idFromFrontEnd);
}

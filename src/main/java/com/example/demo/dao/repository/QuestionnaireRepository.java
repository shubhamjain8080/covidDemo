package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Questionnaire;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionnaireRepository extends Neo4jRepository<Questionnaire, Long> {

    @Query("Match(q:Questionnaire) where $sym in q.symptoms  RETURN q")
    List<Questionnaire> findAllMembersWithSymptom(String sym);

    @Query("Match(q:Questionnaire) where $linkingId = q.linkingId  RETURN q")
    Questionnaire findQuestionnaireFromLinkingId(String linkingId);
}

package com.example.demo.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@EqualsAndHashCode
@Data
public class Person {

    private static final long serialVersionUID = 1L;

    @GeneratedValue @Id
    Long id;
    String name;
    Integer age;
    String linkingId;

    @Relationship(type = "HAS_SUBMITTED", direction = Relationship.OUTGOING)
    Questionnaire questionnaire;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public String getLinkingId() {
        return linkingId;
    }

    public void setLinkingId(String linkingId) {
        this.linkingId = linkingId;
    }
}

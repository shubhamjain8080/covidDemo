package com.example.demo.dao.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
@EqualsAndHashCode
@Data
public class Questionnaire {
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String temperature;

    @Relationship(type = "HAS_SYMPTOM", direction = Relationship.OUTGOING)
    private List<String> symptoms;
    private List<String> additionalSymptoms;
    private String travelHistory;
    private List<String> existingDisease;
    private String linkingId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getExistingDisease() {
        return existingDisease;
    }

    public void setExistingDisease(List<String> existingDisease) {
        this.existingDisease = existingDisease;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public List<String> getAdditionalSymptoms() {
        return additionalSymptoms;
    }

    public void setAdditionalSymptoms(List<String> additionalSymptoms) {
        this.additionalSymptoms = additionalSymptoms;
    }

    public String getTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(String travelHistory) {
        this.travelHistory = travelHistory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkingId() {
        return linkingId;
    }

    public void setLinkingId(String linkingId) {
        this.linkingId = linkingId;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", temperature='" + temperature + '\'' +
                ", symptoms=" + symptoms +
                ", additionalSymptoms=" + additionalSymptoms +
                ", travelHistory='" + travelHistory + '\'' +
                ", existingDisease=" + existingDisease +
                '}';
    }
}

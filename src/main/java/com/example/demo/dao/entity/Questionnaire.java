package com.example.demo.dao.entity;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@NodeEntity
public class Questionnaire {
    @Id @GeneratedValue
    private Long id;
    private String idFromFrontEnd;
    private Integer age;
    private String gender;
    private String temperature;
    private List<String> symptoms;
    private List<String> additionalSymptoms;
    private String travelHistory;
    private List<String> existingDisease;

    public Integer getAge() {
        return age;
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

    public String getIdFromFrontEnd() {
        return idFromFrontEnd;
    }

    public void setIdFromFrontEnd(String idFromFrontEnd) {
        this.idFromFrontEnd = idFromFrontEnd;
    }

}

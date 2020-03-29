package com.example.demo.model;

import java.util.List;

public class Questionnaire {
    public Integer age;
    public String gender;
    public String temperature;
    public List<String> symptoms;
    public List<String> additionalSymptoms;
    public String travelHistory;
    public List<String> existingDisease;

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

    @Override
    public String toString() {
        return "Questionnaire{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", temperature='" + temperature + '\'' +
                ", symptoms=" + symptoms +
                ", additionalSymptoms=" + additionalSymptoms +
                ", travelHistory='" + travelHistory + '\'' +
                ", existingDisease=" + existingDisease +
                '}';
    }
}

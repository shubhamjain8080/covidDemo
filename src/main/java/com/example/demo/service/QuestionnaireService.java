package com.example.demo.service;

import com.example.demo.dao.entity.Questionnaire;
import com.example.demo.dao.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionnaireService {

    QuestionnaireRepository questionnaireRepository;

    public QuestionnaireService(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public Questionnaire createNewQuestionnaire(
            String name, Integer age, String gender, String temperature, List<String> symptoms,
            List<String> additionalSymptoms, String travelHistory, List<String> existingDisease
    )
    {
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setName(name);
        questionnaire.setAge(age);
        questionnaire.setGender(gender);
        questionnaire.setTemperature(temperature);
        questionnaire.setSymptoms(symptoms);
        questionnaire.setAdditionalSymptoms(additionalSymptoms);
        questionnaire.setTravelHistory(travelHistory);
        questionnaire.setExistingDisease(existingDisease);
        return questionnaireRepository.save(questionnaire);
    }

    public List<Questionnaire> findQuestionnairesForASymptom(String symptom){
        return new ArrayList<>();
    }
}

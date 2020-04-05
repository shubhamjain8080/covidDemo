package com.example.demo.service;

import com.example.demo.dao.entity.Questionnaire;
import com.example.demo.dao.repository.QuestionnaireRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionnaireService {

    private final QuestionnaireRepository questionnaireRepository;

    public QuestionnaireService(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    @Transactional
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

    @Transactional
    public List<Questionnaire> findQuestionnairesForASymptom(String symptom){
        return questionnaireRepository.findAllMembersWithSymptom(symptom);
    }

    @Transactional(readOnly = true)
    public List<Questionnaire> getAllQuestionnaires() {
        return (List<Questionnaire>) questionnaireRepository.findAll();
    }


}

package com.example.demo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.dao.entity.Questionnaire;
import com.example.demo.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionnaireQuery implements GraphQLQueryResolver {

    @Autowired
    private QuestionnaireService questionnaireService;

    public List<Questionnaire> getQuestionnaires() {
        return this.questionnaireService.getAllQuestionnaires();
    }

    public List<Questionnaire> getQuestionnairesForASymptom(String symptom) {
        return this.questionnaireService.findQuestionnairesForASymptom(symptom);
    }
}

package com.example.demo.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.dao.entity.Questionnaire;
import com.example.demo.dao.repository.QuestionnaireRepository;
import com.example.demo.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
public class QuestionnaireMutation implements GraphQLMutationResolver {

    @Autowired
    QuestionnaireService questionnaireService;

    public Questionnaire submitQuestionnaire(
            String name, Integer age, String gender, String temprature, List<String> symptoms,
            List<String> additionalSymptoms, String travelHistory, List<String> existingDisease
            )
    {
        return questionnaireService.createNewQuestionnaire(
                name,age, gender, temprature, symptoms,
                additionalSymptoms, travelHistory, existingDisease
        );
    }

    public List<Questionnaire> findQuestionnairesForASymptom(String symptom){
        return questionnaireService.findQuestionnairesForASymptom(symptom);
    }

}

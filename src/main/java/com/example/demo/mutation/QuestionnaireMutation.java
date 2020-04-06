package com.example.demo.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.dao.entity.Person;
import com.example.demo.dao.entity.Questionnaire;
import com.example.demo.service.PersonService;
import com.example.demo.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class QuestionnaireMutation implements GraphQLMutationResolver {

    @Autowired
    QuestionnaireService questionnaireService;

    @Autowired
    PersonService personService;

    public Questionnaire submitQuestionnaire(
            final String name, final Integer age, final String gender, final String temperature, final List<String> symptoms,
            final List<String> additionalSymptoms, final String travelHistory, final List<String> existingDisease, final String linkingId
            )
    {
        Questionnaire newQuestionnaire = questionnaireService.createNewQuestionnaire(
                name, age, gender, temperature, symptoms,
                additionalSymptoms, travelHistory, existingDisease, linkingId
        );
        personService.linkPersonToQuestionnaireById(linkingId, newQuestionnaire);
        return newQuestionnaire;
    }

    public Person addPerson(final String name, final Integer age, final String linkingId){
        Questionnaire questionnaire = questionnaireService.getQuestionnaireById(linkingId);
        return personService.addPerson(name,age,linkingId,questionnaire);
    }
}

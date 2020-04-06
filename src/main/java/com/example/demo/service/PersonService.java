package com.example.demo.service;

import com.example.demo.dao.entity.Person;
import com.example.demo.dao.entity.Questionnaire;
import com.example.demo.dao.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person addPerson(String name, Integer age, String linkingId, Questionnaire questionnaire){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setLinkingId(linkingId);
        person.setQuestionnaire(questionnaire);
        return personRepository.save(person);
    }

    public Person linkPersonToQuestionnaireById(String linkingId, Questionnaire questionnaire) {
        Optional<Person> person = personRepository.getPeopleWithLinkingId(linkingId);
        person.ifPresent(person1 -> person1.setQuestionnaire(questionnaire));
        person.ifPresent(person1 -> personRepository.save(person1));
        return person.get();
    }

    public List<Person> findPeopleWithASymptom(String symptom) {
        return personRepository.findPeopleWithSymptom(symptom);
    }
}

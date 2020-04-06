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

    public Person addPerson(String name, Integer age){
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return personRepository.save(person);
    }

    public Person linkPersonToQuestionnaireById(Long personId, Questionnaire questionnaire) {
        Optional<Person> person = personRepository.findById(personId);
        System.out.println(person.get());
        person.ifPresent(person1 -> person1.setQuestionnaire(questionnaire));
        person.ifPresent(person1 -> personRepository.save(person1));
        System.out.println(person.get());
        return person.get();
    }

    public List<Person> findPeopleWithASymptom(String symptom) {
        return personRepository.findPeopleWithSymptom(symptom);
    }
}

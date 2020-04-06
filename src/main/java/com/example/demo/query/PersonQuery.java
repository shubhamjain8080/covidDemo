package com.example.demo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.dao.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonQuery implements GraphQLQueryResolver {

    @Autowired
    PersonService personService;

    public List<Person> getPeopleWithASymptom(String symptom) {
        return this.personService.findPeopleWithASymptom(symptom);
    }
}

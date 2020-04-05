package com.example.demo.mutation;

import com.example.demo.dao.entity.Person;
import com.example.demo.dao.repository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PersonMutation {
    @Autowired
    PersonRespository personRespository;
    public void addPerson(@RequestBody Person person){
        System.out.println(person);
        personRespository.save(person);
    }

    public Iterable<Person> getAllPerson(){
        return personRespository.findAll();
    }

    public void deleteAllPerson(){
        personRespository.deleteAll();
    }
}

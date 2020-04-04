package com.example.demo.controller;

import com.example.demo.dao.entity.Person;
import com.example.demo.dao.repository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/person")
@RestController
public class PersonController {
    @Autowired
    PersonRespository personRespository;
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person){
        System.out.println(person);
        personRespository.save(person);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public Iterable<Person> getAllPerson(){
        return personRespository.findAll();
    }

    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    public void deleteAllPerson(){
        personRespository.deleteAll();
    }
}

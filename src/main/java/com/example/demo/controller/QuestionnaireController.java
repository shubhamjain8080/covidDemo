package com.example.demo.controller;

import com.example.demo.dao.entity.Questionnaire;
import com.example.demo.dao.repository.PersonRespository;
import com.example.demo.dao.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class QuestionnaireController {
    @Autowired
    QuestionnaireRepository questionnaireRepository;
    @RequestMapping(value="/submitQuestionnaire", method = RequestMethod.POST)
    public void submitQuestionnaire(@RequestBody Questionnaire questionnaire){
        questionnaireRepository.save(questionnaire);
    }

}

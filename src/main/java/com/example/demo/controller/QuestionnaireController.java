package com.example.demo.controller;

import com.example.demo.model.Questionnaire;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class QuestionnaireController {

    @RequestMapping(value="/questionnaireForm", method = RequestMethod.GET)
    public String getTheQuestionnaireForm(Model model){
        model.addAttribute("questionnaire", new Questionnaire());
        return "questionnaireForm";
    }

    @RequestMapping(value="/resultsOfQuestionnaire", method = RequestMethod.POST)
    public String resultsQuestionnaireForm(@ModelAttribute Questionnaire questionnaire){
        System.out.println(questionnaire.toString());
        return "result";
    }

}

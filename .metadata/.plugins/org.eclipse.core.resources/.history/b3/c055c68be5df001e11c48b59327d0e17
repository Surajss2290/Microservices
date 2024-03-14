package com.question.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.question.entities.Question;
import com.question.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	//create 
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}
	
	//get all
	@GetMapping
	public List<Question> get(){
	return	questionService.get();
	}
	
	//get by id
	@GetMapping("{id}")
	public Question getone(@RequestParam Long id) {
	return questionService.getone(id);
		
	}
	
	//get all question of specific quiz
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionsofQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsofQuiz(quizId);
		
	}

}

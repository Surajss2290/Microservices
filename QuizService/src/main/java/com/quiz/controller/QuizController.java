package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entitites.Quiz;
import com.quiz.services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	//create
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
	  return	quizService.add(quiz);
	}
	
	@GetMapping
	public List<Quiz> get(){
		return quizService.get();
	}
	
	@GetMapping("{id}")
	public Quiz getone(@PathVariable Long id){
		return quizService.get(id);
	}
	
  

}

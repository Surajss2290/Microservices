package com.quiz.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.quiz.entitites.Question;
//FOR Call the Caller Service

//@FeignClient(name = "QUESTION-SERVICE")
//@FeignClient(url = "http://localhost:9092",value ="Question-Client")
//@FeignClient(url = "http://localhost:8082",value ="Question-Client")
@FeignClient(name ="QUESTION-SERVICE")


public interface QuestionClient {
	
	@GetMapping("/question/quiz/{quizId}")
	List<Question> getQuestionofQuiz(@PathVariable Long quizId);

	
}

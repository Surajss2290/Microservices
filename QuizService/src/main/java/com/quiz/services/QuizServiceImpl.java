package com.quiz.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.entitites.Quiz;
import com.quiz.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{
	
@Autowired
	private QuizRepository quizRepository;
	
	@Autowired
	private QuestionClient questionClient;
	

	//Add Quiz

	@Override
	public Quiz add(Quiz quiz) {
	
		return quizRepository.save(quiz);
	}
	
	//Get Question with q

	@Override
	public List<Quiz> get() {
		
		List<Quiz> quizzes=quizRepository.findAll();
		
     List<Quiz> newQuizList= quizzes.stream().map(quiz->{
	quiz.setQuestions(questionClient.getQuestionofQuiz(quiz.getId()));
	return quiz;
}).collect(Collectors.toList());
		
		return newQuizList;
	}

	
	
	@Override
	public Quiz get(Long id) {
		
		Quiz quiz=quizRepository.findById(id).orElse(null);
		quiz.setQuestions(questionClient.getQuestionofQuiz(quiz.getId()));
		return quiz;
	}

}

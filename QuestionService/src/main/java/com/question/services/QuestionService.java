package com.question.services;

import java.util.List;

import com.question.entities.Question;

public interface QuestionService {

	Question create(Question question);
	
	List<Question> get();
	
	Question getone(Long id);
	
	List<Question> getQuestionsofQuiz(Long quizId);
}

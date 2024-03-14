package com.question.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.question.entities.Question;
import com.question.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
    private QuestionRepository questionRepository;	
	@Override
	public Question create(Question question) {
		
		return questionRepository.save(question) ;
	}

	@Override
	public List<Question> get() {
	
		return questionRepository.findAll();
	}

	@Override
	public Question getone(Long id) {
		
		return questionRepository.findById(id).orElse(null);
	}

	@Override
	public List<Question> getQuestionsofQuiz(Long quizId) {
		
		return questionRepository.findByQuizid(quizId);
	}

}

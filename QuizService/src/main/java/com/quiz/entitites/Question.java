package com.quiz.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

	
	private Long questionid;
	private String question;
	private Long quizid;
}


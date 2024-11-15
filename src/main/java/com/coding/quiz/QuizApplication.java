package com.coding.quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coding.quiz.solution.q_340212.Q340212;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QuizApplication.class, args);
		new Q340212().execute();
	}

}

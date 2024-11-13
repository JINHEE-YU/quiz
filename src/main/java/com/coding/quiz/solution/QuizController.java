package com.coding.quiz.solution;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coding.quiz.solution.q_340213.Q340213;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class QuizController {

  @GetMapping("list")
  public String getMethodName(Model model) {
    List<Card> cards = new ArrayList<>();
    cards.add(new Card("[PCCP 기출문제] 1번 / 동영상 재생기", "340213",
        "https://school.programmers.co.kr/learn/courses/30/lessons/340213"));

    new Q340213().execute();

    model.addAttribute("cards", cards);
    return "list";
  }

}

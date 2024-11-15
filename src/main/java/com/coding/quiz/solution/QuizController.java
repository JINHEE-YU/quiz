package com.coding.quiz.solution;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.coding.quiz.solution.q_340212.Q340212;
import com.coding.quiz.solution.q_340213.Q340213;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class QuizController {

  @GetMapping("list")
  public String getMethodName(Model model) {
    List<Card> cards = new ArrayList<>();

    for (SolutionList solution : SolutionList.values()) {
      cards.add(new Card(solution.getTitle(), solution.getNo(), solution.getUrl()));
    }

    // new Q340213().execute();
    // new Q340212().execute();

    model.addAttribute("cards", cards);
    return "list";
  }

}

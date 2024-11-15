package com.coding.quiz.solution;

import lombok.Getter;

@Getter
public enum SolutionList {
  Q340213("[PCCP 기출문제] 1번 / 동영상 재생기", "340213", "https://school.programmers.co.kr/learn/courses/30/lessons/340213"),
  Q340212("PCCP 기출문제] 2번 / 퍼즐 게임 챌린지", "340212", "https://school.programmers.co.kr/learn/courses/30/lessons/340212");

  private String title;
  private String no;
  private String url;

  SolutionList(String title, String no, String url) {
    this.title = title;
    this.no = no;
    this.url = url;
  }
}

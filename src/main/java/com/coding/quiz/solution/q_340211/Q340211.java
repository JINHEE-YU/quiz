package com.coding.quiz.solution.q_340211;

import java.util.HashMap;
import java.util.Objects;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Q340211 {
  public static void main(String[] args) {

    int points[][] = null;
    int routes[][] = null;

    points = new int[][] { { 3, 2 }, { 6, 4 }, { 4, 7 }, { 1, 4 } };
    routes = new int[][] { { 4, 2 }, { 1, 3 }, { 2, 4 } };
    new Solution().solution(points, routes); // 1
    points = new int[][] { { 3, 2 }, { 6, 4 }, { 4, 7 }, { 1, 4 } };
    routes = new int[][] { { 4, 2 }, { 1, 3 }, { 4, 2 }, { 4, 3 } };
    new Solution().solution(points, routes); // 9
    points = new int[][] { { 2, 2 }, { 2, 3 }, { 2, 7 }, { 6, 6 }, { 5, 2
    } };
    routes = new int[][] { { 2, 3, 4, 5 }, { 1, 3, 4, 5 } };
    new Solution().solution(points, routes); // 0

  }
}

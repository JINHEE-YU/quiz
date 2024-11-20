package com.coding.quiz.solution.q_340211;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Solution {
  public int solution(int[][] points, int[][] routes) {
    int answer = 0;

    List<Point> allPoints = new ArrayList<>();
    List<Robot> robots = new ArrayList<>();

    // setAllPoints
    for (int[] point : points) {
      allPoints.add(new Point(point));
    }

    // setRobots
    for (int i = 0; i < routes.length; i++) {
      List<Point> targetRoutes = new ArrayList<>();
      for (int j = 0; j < routes[0].length; j++) {
        targetRoutes.add(allPoints.get(routes[i][j] - 1).clone());
      }
      robots.add(new Robot(targetRoutes));
    }

    // 충돌 횟수 구하기
    int maxMoveCount = 0;
    for (Robot robot : robots) {
      maxMoveCount = Math.max(maxMoveCount, robot.getHistory().size());
    }

    int crushCount = 0;
    int moveIndex = 0;
    while (moveIndex < maxMoveCount) {
      HashMap<String, Integer> crushPoints = new HashMap<String, Integer>();
      for (int i = 0; i < robots.size() - 1; i++) {
        for (int j = i + 1; j < robots.size(); j++) {

          Point a = null;
          Point b = null;
          try {
            a = robots.get(i).getHistory().get(moveIndex);
            b = robots.get(j).getHistory().get(moveIndex);
          } catch (java.lang.IndexOutOfBoundsException e) {
          }
          if (Objects.nonNull(a) && Objects.nonNull(b) && a.isEqualTo(b)) {
            crushPoints.compute(a.toString(), (key, value) -> (Objects.isNull(value) ? 1 : value + 1));
          }
        }
      }

      if (crushPoints.size() > 0) {
        crushCount = crushCount + crushPoints.size();
      }
      moveIndex++;
    }

    answer = crushCount;
    log.info("answer : " + answer);
    return answer;
  }
}

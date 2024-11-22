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
    int crushCount = 0;
    HashMap<Integer, HashMap<String, Integer>> historyBySeconds = new HashMap<Integer, HashMap<String, Integer>>();

    for (Robot robot : robots) {
      List<Point> history = robot.getHistory();
      // System.out.println("=====");
      for (int time = 0; time < history.size(); time++) {
        historyBySeconds.putIfAbsent(time, new HashMap<>());
        HashMap<String, Integer> historyMap = historyBySeconds.get(time);

        // System.out.println("history.get(time) : " + history.get(time).toString());

        historyMap.put(history.get(time).toString(),
            historyMap.getOrDefault(history.get(time).toString(), 0) + 1);

        // System.out.println("historyBySeconds.toString() : " +
        // historyBySeconds.toString());
      }

    }

    for (HashMap<String, Integer> history : historyBySeconds.values()) {
      crushCount += history.values().stream().filter(values -> values >= 2).count();
    }

    answer = crushCount;
    log.info("answer : " + answer);
    return answer;
  }
}

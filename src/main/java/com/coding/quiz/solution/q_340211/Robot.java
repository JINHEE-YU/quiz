package com.coding.quiz.solution.q_340211;

import java.util.ArrayList;
import java.util.List;

class Robot {
  private Point previousPoint = null;
  private Point nextPoint = null;

  private List<Point> points = new ArrayList<>();
  private List<Point> history = new ArrayList<Point>();

  Robot(List<Point> targetRoutes) {
    this.points = targetRoutes;
    calulateMovePoints();
  }

  private void calulateMovePoints() {

    previousPoint = points.get(0);
    history.add(previousPoint.clone());

    for (int i = 0; i < points.size() - 1; i++) {
      nextPoint = points.get(i + 1);

      goToNextPoint(nextPoint);
    }

  }

  private void goToNextPoint(Point nextPoint) {

    while (previousPoint.getR() != nextPoint.getR()) {
      if (previousPoint.getR() > nextPoint.getR()) {
        previousPoint.minusR();
      } else {
        previousPoint.plusR();
      }
      history.add(previousPoint.clone());
    }

    while (previousPoint.getC() != nextPoint.getC()) {
      if (previousPoint.getC() > nextPoint.getC()) {
        previousPoint.minusC();
      } else {
        previousPoint.plusC();
      }

      history.add(previousPoint.clone());
    }
    System.out.println("Robot history : " + history.toString());
  }

  List<Point> getHistory() {
    return this.history;
  }

}

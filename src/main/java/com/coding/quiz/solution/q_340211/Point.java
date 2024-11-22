package com.coding.quiz.solution.q_340211;

class Point implements Cloneable {
  private int r;
  private int c;

  Point(int[] point) {
    this.r = point[0];
    this.c = point[1];
  }

  boolean isEqualTo(Point other) {
    return r == other.r && c == other.c;
  }

  int getR() {
    return r;
  }

  int getC() {
    return c;
  }

  void minusR() {
    this.r = r - 1;
  }

  void plusR() {
    this.r = r + 1;
  }

  void minusC() {
    this.c = c - 1;
  }

  void plusC() {
    this.c = c + 1;
  }

  @Override
  public Point clone() {
    try {
      return (Point) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public String toString() {
    return "(" + r + ", " + c + ")";
  }
}

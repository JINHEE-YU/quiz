package com.coding.quiz.solution.q_340213;

import com.coding.quiz.solution.q_340213.Time;

public class MovieTime {

  private Time posT = new Time();
  private Time opStartT = new Time();
  private Time videoLenT = new Time();
  private Time opEndT = new Time();
  private static final int MOVE_SECOND = 10;

  public MovieTime(String videoLen, String pos, String opStart, String opEnd) {
    this.videoLenT = new Time(videoLen);
    this.posT = new Time(pos);
    this.opStartT = new Time(opStart);
    this.opEndT = new Time(opEnd);
  }

  public void skipOpening() {
    this.posT.setSeconds(this.isOpeningTime() ? this.opEndT.getSeconds() : this.posT.getSeconds());
  }

  public boolean isOpeningTime() {
    return opStartT.getSeconds() <= posT.getSeconds() && posT.getSeconds() <= opEndT.getSeconds();
  }

  public void move(String[] commands) {
    skipOpening();
    for (String cmd : commands) {
      move(cmd);
      skipOpening();
    }
  }

  public void move(String cmd) {
    switch (cmd) {
      case "next":
        this.posT.add(MOVE_SECOND);
        if (this.posT.getSeconds() > this.videoLenT.getSeconds()) {
          this.posT.setSeconds(this.videoLenT.getSeconds());
        }
        break;
      case "prev":
        this.posT.minus(MOVE_SECOND);
        if (this.posT.getSeconds() < 0) {
          this.posT.setSeconds(0);
        }
        break;
      default:
        throw new IllegalArgumentException("명령어 확인 필요 : " + cmd);
    }
  }

  public String getStringPosT() {
    return this.posT.getStringTime();
  }
}

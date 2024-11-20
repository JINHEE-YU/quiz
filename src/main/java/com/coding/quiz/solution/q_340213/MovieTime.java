package com.coding.quiz.solution.q_340213;

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
    try {
      this.posT = this.isOpeningTime() ? this.opEndT.clone() : this.posT.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
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
          try {
            this.posT = this.videoLenT.clone();
          } catch (CloneNotSupportedException e) {
            e.printStackTrace();
          }
        }
        break;
      case "prev":
        this.posT.minus(MOVE_SECOND);
        if (this.posT.getSeconds() < 0) {
          this.posT = new Time("00:00");
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
